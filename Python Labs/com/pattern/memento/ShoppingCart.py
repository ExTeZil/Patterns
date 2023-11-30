from com.pattern.memento.ShoppingCartMemento import ShoppingCartMemento
from com.pattern.memento.ShoppingCartState import ShoppingCartState


class ShoppingCart:
    def __init__(self):
        self.items = []

    def add_item(self, item):
        self.items.append(item)

    def display_items(self):
        print("Shopping Cart Items:", self.items)

    def save(self):
        return ShoppingCartMemento(ShoppingCartState(self.items))

    def restore(self, memento):
        self.items = memento.get_state().get_items()