package com.pattern.mediator;

public class InventorySystem implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void notify(String event) {
        System.out.println("Inventory System received notification: " + event);
        // Additional logic related to inventory management...
    }

    public void checkStock(String item) {
        // Inventory-specific logic...
        mediator.notify(this, "Stock checked for item: " + item);
    }
}
