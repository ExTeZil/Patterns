package com.pattern.chainOfResponsibility;

public interface DiscountHandler {
    void setNextHandler(DiscountHandler nextHandler);
    void applyDiscount(Order order);
}
