package model;

import java.util.HashSet;
import java.util.Set;

public class AuctionNotifierImplementation implements AuctionNotifier {

    private Set<AuctionObserver> auctionObservers = new HashSet<>();

    @Override
    public void registerObserver(AuctionObserver auctionObserver) {
        auctionObservers.add(auctionObserver);
    }

    @Override
    public void unregisterObserver(AuctionObserver auctionObserver) {
        auctionObservers.remove(auctionObserver);
    }

    @Override
    public void notifyObservers() {
        auctionObservers.forEach(auctionObserver -> auctionObserver.update());

    }
}
