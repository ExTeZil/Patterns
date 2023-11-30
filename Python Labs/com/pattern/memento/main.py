from com.pattern.memento.ShoppingCart import ShoppingCart
from com.pattern.memento.ShoppingCartCaretaker import ShoppingCartCaretaker

if __name__ == "__main__":
    shopping_cart = ShoppingCart()
    caretaker = ShoppingCartCaretaker()

    # Add items to the shopping cart
    shopping_cart.add_item("Shirt")
    shopping_cart.add_item("Jeans")
    shopping_cart.display_items()

    # Save the state (create a memento)
    memento1 = shopping_cart.save()
    caretaker.save_memento(memento1)

    # Add more items
    shopping_cart.add_item("Sweater")
    shopping_cart.display_items()

    # Undo to the previous state
    undo_memento = caretaker.undo()
    if undo_memento:
        shopping_cart.restore(undo_memento)
        shopping_cart.display_items()