from com.pattern.Mediator.InventorySystem import InventorySystem
from com.pattern.Mediator.OnlineClothingStoreMediator import OnlineClothingStoreMediator
from com.pattern.Mediator.OrderProcessingSystem import OrderProcessingSystem
from com.pattern.Mediator.PaymentSystem import PaymentSystem

if __name__ == "__main__":
    inventory_system = InventorySystem()
    order_processing_system = OrderProcessingSystem()
    payment_system = PaymentSystem()

    mediator = OnlineClothingStoreMediator(inventory_system, order_processing_system, payment_system)

    # Simulate a purchase
    mediator.complete_purchase("Shirt", 2, 50.0)