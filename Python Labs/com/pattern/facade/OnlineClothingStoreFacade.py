from com.pattern.facade.InventorySystem import InventorySystem
from com.pattern.facade.OrderProcessingSystem import OrderProcessingSystem
from com.pattern.facade.PaymentSystem import PaymentSystem


class OnlineClothingStoreFacade:
    def __init__(self):
        self.inventory_system = InventorySystem()
        self.order_processing_system = OrderProcessingSystem()
        self.payment_system = PaymentSystem()

    def purchase_item(self, item, quantity, price):
        self.inventory_system.check_stock(item)
        self.order_processing_system.place_order(item, quantity)
        self.payment_system.process_payment(quantity * price)
        print(f"Purchase completed for {quantity} {item}")