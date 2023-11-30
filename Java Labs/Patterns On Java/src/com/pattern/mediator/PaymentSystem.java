package com.pattern.mediator;

public class PaymentSystem implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void notify(String event) {
        System.out.println("Payment System received notification: " + event);
        // Additional logic related to payment processing...
    }

    public void processPayment(double amount) {
        // Payment processing logic...
        mediator.notify(this, "Payment processed for amount: $" + amount);
    }
}
