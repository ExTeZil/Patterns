from com.pattern.command.Command import Command


class CancelOrderCommand(Command):
    def __init__(self, order):
        self.order = order

    def execute(self):
        self.order.cancel_order()