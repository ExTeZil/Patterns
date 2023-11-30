package com.pattern.memento;

import java.util.Stack;

public class ShoppingCartCaretaker {
    private Stack<ShoppingCartMemento> mementoStack = new Stack<>();

    public void saveMemento(ShoppingCartMemento memento) {
        mementoStack.push(memento);
    }

    public ShoppingCartMemento undo() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        } else {
            return null;
        }
    }
}