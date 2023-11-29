from com.pattern.command.CancelOrderCommand import CancelOrderCommand
from com.pattern.command.Order import Order
from com.pattern.command.OrderInvoker import OrderInvoker
from com.pattern.command.PlaceOrderCommand import PlaceOrderCommand

if __name__ == "__main__":
    order = Order()
    invoker = OrderInvoker()

    # Create commands
    place_order_command = PlaceOrderCommand(order)
    cancel_order_command = CancelOrderCommand(order)

    # Set and execute commands
    invoker.set_command(place_order_command)
    invoker.execute_command()

    invoker.set_command(cancel_order_command)
    invoker.execute_command()