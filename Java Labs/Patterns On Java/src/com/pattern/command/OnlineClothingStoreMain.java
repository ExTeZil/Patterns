package com.pattern.command;

public class OnlineClothingStoreMain     {
    public static void main(String[] args) {
        Order order = new Order();
        OrderInvoker invoker = new OrderInvoker();

        // Create commands
        Command placeOrderCommand = new PlaceOrderCommand(order);
        Command cancelOrderCommand = new CancelOrderCommand(order);

        // Set and execute commands
        invoker.setCommand(placeOrderCommand);
        invoker.executeCommand();

        invoker.setCommand(cancelOrderCommand);
        invoker.executeCommand();
    }
}
