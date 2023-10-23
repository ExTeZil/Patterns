package com.pattern.decorator;

public abstract class ClothingItemDecorator implements ClothingItem {
    protected ClothingItem decoratedItem;

    public ClothingItemDecorator(ClothingItem decoratedItem) {
        this.decoratedItem = decoratedItem;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedItem.getPrice();
    }
}
