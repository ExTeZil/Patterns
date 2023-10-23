package com.pattern.decorator;

public class SizeDecorator extends ClothingItemDecorator {
    private int size;

    public SizeDecorator(ClothingItem decoratedItem, int size) {
        super(decoratedItem);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Size: " + size;
    }

    @Override
    public double getPrice() {
        // Additional cost for size
        return super.getPrice() + 10.0;
    }
}
