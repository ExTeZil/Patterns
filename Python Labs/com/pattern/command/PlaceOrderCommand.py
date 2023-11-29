from com.pattern.command.Command import Command


class PlaceOrderCommand(Command):
    def __init__(self, order):
        self.order = order

    def execute(self):
        self.order.place_order()