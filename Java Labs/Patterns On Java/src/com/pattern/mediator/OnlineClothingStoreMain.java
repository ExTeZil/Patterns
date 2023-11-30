package com.pattern.mediator;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();
        OrderProcessingSystem orderProcessingSystem = new OrderProcessingSystem();
        PaymentSystem paymentSystem = new PaymentSystem();

        OnlineClothingStoreMediator mediator = new OnlineClothingStoreMediator(inventorySystem, orderProcessingSystem, paymentSystem);

        // Simulate a purchase
        mediator.completePurchase("Shirt", 2, 50.0);
    }
}