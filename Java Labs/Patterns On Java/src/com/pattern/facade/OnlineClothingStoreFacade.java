package com.pattern.facade;

class OnlineClothingStoreFacade {
    private InventorySystem inventorySystem;
    private OrderProcessingSystem orderProcessingSystem;
    private PaymentSystem paymentSystem;

    public OnlineClothingStoreFacade() {
        this.inventorySystem = new InventorySystem();
        this.orderProcessingSystem = new OrderProcessingSystem();
        this.paymentSystem = new PaymentSystem();
    }

    public void purchaseItem(String item, int quantity, double price) {
        inventorySystem.checkStock(item);
        orderProcessingSystem.placeOrder(item, quantity);
        paymentSystem.processPayment(quantity * price);
        System.out.println("Purchase completed for " + quantity + " " + item);
    }
}
