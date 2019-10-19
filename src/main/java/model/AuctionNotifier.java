package model;

public interface AuctionNotifier {

    void registerObserver(AuctionObserver auctionObserver);
    void unregisterObserver(AuctionObserver auctionObserver);
    void notifyObservers();
}
