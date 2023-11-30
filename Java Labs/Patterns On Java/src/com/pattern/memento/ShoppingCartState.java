package com.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartState {
    private List<String> items;

    public ShoppingCartState(List<String> items) {
        this.items = new ArrayList<>(items);
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }
}