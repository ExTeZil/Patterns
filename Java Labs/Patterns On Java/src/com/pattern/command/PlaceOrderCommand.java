package com.pattern.command;

public class PlaceOrderCommand implements Command {
    private Order order;

    public PlaceOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.placeOrder();
    }
}
