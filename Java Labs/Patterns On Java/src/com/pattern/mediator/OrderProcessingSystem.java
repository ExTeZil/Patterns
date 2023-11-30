package com.pattern.mediator;

public class OrderProcessingSystem implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void notify(String event) {
        System.out.println("Order Processing System received notification: " + event);
        // Additional logic related to order processing...
    }

    public void placeOrder(String item, int quantity) {
        // Order processing logic...
        mediator.notify(this, "Order placed for item: " + item + ", Quantity: " + quantity);
    }
}
