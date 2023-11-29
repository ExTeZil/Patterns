
class Order:
    def __init__(self, total_amount):
        self.total_amount = total_amount
        self.discount = 0.0

    def apply_discount(self, discount):
        self.discount += discount