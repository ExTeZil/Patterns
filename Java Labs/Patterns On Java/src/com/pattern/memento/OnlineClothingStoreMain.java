package com.pattern.memento;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        ShoppingCartCaretaker caretaker = new ShoppingCartCaretaker();

        // Add items to the shopping cart
        shoppingCart.addItem("Shirt");
        shoppingCart.addItem("Jeans");
        shoppingCart.displayItems();

        // Save the state (create a memento)
        ShoppingCartMemento memento1 = shoppingCart.save();
        caretaker.saveMemento(memento1);

        // Add more items
        shoppingCart.addItem("Sweater");
        shoppingCart.displayItems();

        // Undo to the previous state
        ShoppingCartMemento undoMemento = caretaker.undo();
        if (undoMemento != null) {
            shoppingCart.restore(undoMemento);
            shoppingCart.displayItems();
        }
    }
}