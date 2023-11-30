from com.pattern.Mediator.Component import Component


class OrderProcessingSystem(Component):
    def __init__(self):
        self.mediator = None

    def set_mediator(self, mediator):
        self.mediator = mediator

    def notify(self, event):
        print(f"Order Processing System received notification: {event}")
        # Additional logic related to order processing...

    def place_order(self, item, quantity):
        # Order processing logic...
        self.mediator.notify(self, f"Order placed for item: {item}, Quantity: {quantity}")