package com.pattern.chainOfResponsibility;

public class PercentageDiscountHandler implements DiscountHandler {
    private DiscountHandler nextHandler;

    @Override
    public void setNextHandler(DiscountHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void applyDiscount(Order order) {
        if (order.getTotalAmount() >= 100) {
            order.applyDiscount(0.1); // 10% discount
            System.out.println("Applied 10% discount.");
        } else if (nextHandler != null) {
            nextHandler.applyDiscount(order);
        }
    }
}
