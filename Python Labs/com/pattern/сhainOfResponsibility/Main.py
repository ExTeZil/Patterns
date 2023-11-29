from com.pattern.сhainOfResponsibility.FixedAmountDiscountHandler import FixedAmountDiscountHandler
from com.pattern.сhainOfResponsibility.Order import Order
from com.pattern.сhainOfResponsibility.PercentageDiscountHandler import PercentageDiscountHandler

if __name__ == "__main__":
    percentage_discount_handler = PercentageDiscountHandler()
    fixed_amount_discount_handler = FixedAmountDiscountHandler()

    # Set up the chain of responsibility
    percentage_discount_handler.set_next_handler(fixed_amount_discount_handler)

    # Create an order
    order = Order(120)

    # Apply discounts using the chain of responsibility
    percentage_discount_handler.apply_discount(order)

    print(f"Total amount: ${order.total_amount}")
    print(f"Discount applied: ${order.discount}")
    print(f"Final amount: ${order.total_amount - order.discount}")