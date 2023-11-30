class ShoppingCartState:
    def __init__(self, items):
        self.items = list(items)

    def get_items(self):
        return list(self.items)