package com.pattern.memento;

public class ShoppingCartMemento {
    private ShoppingCartState state;

    public ShoppingCartMemento(ShoppingCartState state) {
        this.state = state;
    }

    public ShoppingCartState getState() {
        return state;
    }
}
