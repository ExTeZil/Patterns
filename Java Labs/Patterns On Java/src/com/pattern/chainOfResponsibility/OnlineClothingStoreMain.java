package com.pattern.chainOfResponsibility;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        DiscountHandler percentageDiscountHandler = new PercentageDiscountHandler();
        DiscountHandler fixedAmountDiscountHandler = new FixedAmountDiscountHandler();

        // Set up the chain of responsibility
        percentageDiscountHandler.setNextHandler(fixedAmountDiscountHandler);

        // Create an order
        Order order = new Order(120);

        // Apply discounts using the chain of responsibility
        percentageDiscountHandler.applyDiscount(order);

        System.out.println("Total amount: $" + order.getTotalAmount());
        System.out.println("Discount applied: $" + order.getDiscount());
        System.out.println("Final amount: $" + (order.getTotalAmount() - order.getDiscount()));
    }
}
