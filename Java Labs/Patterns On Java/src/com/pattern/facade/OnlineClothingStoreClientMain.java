package com.pattern.facade;

public class OnlineClothingStoreClient {
    public static void main(String[] args) {
        OnlineClothingStoreFacade facade = new OnlineClothingStoreFacade();

        // Client code interacts with the simplified interface
        facade.purchaseItem("Shirt", 2, 25.0);
        facade.purchaseItem("Pants", 1, 35.0);
    }
}
