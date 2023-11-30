package com.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("Shopping Cart Items: " + items);
    }

    public ShoppingCartMemento save() {
        return new ShoppingCartMemento(new ShoppingCartState(items));
    }

    public void restore(ShoppingCartMemento memento) {
        this.items = memento.getState().getItems();
    }
}
