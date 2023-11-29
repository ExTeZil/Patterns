package com.pattern.chainOfResponsibility;

public class Order {
    private double totalAmount;
    private double discount;

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public void applyDiscount(double discount) {
        this.discount += discount;
    }
}