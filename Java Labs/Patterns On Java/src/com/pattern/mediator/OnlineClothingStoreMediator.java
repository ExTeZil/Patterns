package com.pattern.mediator;

public class OnlineClothingStoreMediator implements Mediator {
    private InventorySystem inventorySystem;
    private OrderProcessingSystem orderProcessingSystem;
    private PaymentSystem paymentSystem;

    public OnlineClothingStoreMediator(InventorySystem inventorySystem, OrderProcessingSystem orderProcessingSystem, PaymentSystem paymentSystem) {
        this.inventorySystem = inventorySystem;
        this.orderProcessingSystem = orderProcessingSystem;
        this.paymentSystem = paymentSystem;

        this.inventorySystem.setMediator(this);
        this.orderProcessingSystem.setMediator(this);
        this.paymentSystem.setMediator(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender instanceof InventorySystem) {
            // Handle notifications from the Inventory System
            orderProcessingSystem.notify(event);
            paymentSystem.notify(event);
        } else if (sender instanceof OrderProcessingSystem) {
            // Handle notifications from the Order Processing System
            inventorySystem.notify(event);
            paymentSystem.notify(event);
        } else if (sender instanceof PaymentSystem) {
            // Handle notifications from the Payment System
            inventorySystem.notify(event);
            orderProcessingSystem.notify(event);
        }
    }

    public void completePurchase(String item, int quantity, double amount) {
        // Simulate a purchase process
        inventorySystem.checkStock(item);
        orderProcessingSystem.placeOrder(item, quantity);
        paymentSystem.processPayment(amount);
    }
}