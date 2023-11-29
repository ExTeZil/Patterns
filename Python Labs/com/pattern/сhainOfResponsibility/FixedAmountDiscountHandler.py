from com.pattern.сhainOfResponsibility.DiscountHandler import DiscountHandler


class FixedAmountDiscountHandler(DiscountHandler):
    def __init__(self):
        self.next_handler = None

    def set_next_handler(self, next_handler):
        self.next_handler = next_handler

    def apply_discount(self, order):
        if order.total_amount >= 50:
            order.apply_discount(5.0)  # $5 discount
            print("Applied $5 discount.")
        elif self.next_handler is not None:
            self.next_handler.apply_discount(order)