package main;

import model.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AuctionNotifier auctionNotifier = new AuctionNotifierImplementation();

        Customer seller = new Customer("Jan Kowalski");
        Auction auction = new Auction(1,"Coffee",null,
                LocalDateTime.now().plusDays(2L),seller,0,null);


        AuctionService auctionService = AuctionService.getInstance();
        Customer customer1 = new Customer("Anna Kowalik");
        auctionService.bid(auction,customer1,20);
        auctionNotifier.registerObserver(customer1);
        Customer customer2 = new Customer("Krzysztof Adamowicz");
        auctionService.bid(auction,customer2,25);
        auctionNotifier.registerObserver(customer2);
        auctionNotifier.notifyObservers();


//        System.out.println("Auction with id: " + auction.getId()+ " finished. Highest bid: " + auction.getHighestBid() + " PLN.");
    }
}
