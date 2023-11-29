package com.pattern.chainOfResponsibility;

public class FixedAmountDiscountHandler implements DiscountHandler {
    private DiscountHandler nextHandler;

    @Override
    public void setNextHandler(DiscountHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void applyDiscount(Order order) {
        if (order.getTotalAmount() >= 50) {
            order.applyDiscount(5.0); // $5 discount
            System.out.println("Applied $5 discount.");
        } else if (nextHandler != null) {
            nextHandler.applyDiscount(order);
        }
    }
}
