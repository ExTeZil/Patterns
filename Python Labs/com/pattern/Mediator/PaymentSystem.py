from com.pattern.Mediator.Component import Component


class PaymentSystem(Component):
    def __init__(self):
        self.mediator = None

    def set_mediator(self, mediator):
        self.mediator = mediator

    def notify(self, event):
        print(f"Payment System received notification: {event}")
        # Additional logic related to payment processing...

    def process_payment(self, amount):
        # Payment processing logic...
        self.mediator.notify(self, f"Payment processed for amount: ${amount}")
