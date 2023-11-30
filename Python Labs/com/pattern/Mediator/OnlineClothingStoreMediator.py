from com.pattern.Mediator.InventorySystem import InventorySystem
from com.pattern.Mediator.Mediator import Mediator
from com.pattern.Mediator.OrderProcessingSystem import OrderProcessingSystem
from com.pattern.Mediator.PaymentSystem import PaymentSystem


class OnlineClothingStoreMediator(Mediator):
    def __init__(self, inventory_system, order_processing_system, payment_system):
        self.inventory_system = inventory_system
        self.order_processing_system = order_processing_system
        self.payment_system = payment_system

        self.inventory_system.set_mediator(self)
        self.order_processing_system.set_mediator(self)
        self.payment_system.set_mediator(self)

    def notify(self, sender, event):
        if isinstance(sender, InventorySystem):
            # Handle notifications from the Inventory System
            self.order_processing_system.notify(event)
            self.payment_system.notify(event)
        elif isinstance(sender, OrderProcessingSystem):
            # Handle notifications from the Order Processing System
            self.inventory_system.notify(event)
            self.payment_system.notify(event)
        elif isinstance(sender, PaymentSystem):
            # Handle notifications from the Payment System
            self.inventory_system.notify(event)
            self.order_processing_system.notify(event)

    def complete_purchase(self, item, quantity, amount):
        # Simulate a purchase process
        self.inventory_system.check_stock(item)
        self.order_processing_system.place_order(item, quantity)
        self.payment_system.process_payment(amount)