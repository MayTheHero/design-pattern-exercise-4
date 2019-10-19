package model;

public class Customer implements AuctionObserver{
    private String fullName;

    public Customer(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void update() {
        System.out.println("New bid has been added to the auction");
    }
}
