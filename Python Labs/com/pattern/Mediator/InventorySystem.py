from com.pattern.Mediator.Component import Component


class InventorySystem(Component):
    def __init__(self):
        self.mediator = None

    def set_mediator(self, mediator):
        self.mediator = mediator

    def notify(self, event):
        print(f"Inventory System received notification: {event}")
        # Additional logic related to inventory management...

    def check_stock(self, item):
        # Inventory-specific logic...
        self.mediator.notify(self, f"Stock checked for item: {item}")