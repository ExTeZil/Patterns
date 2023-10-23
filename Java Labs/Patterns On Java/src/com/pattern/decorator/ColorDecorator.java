package com.pattern.decorator;

public class ColorDecorator extends ClothingItemDecorator {
    private String color;

    public ColorDecorator(ClothingItem decoratedItem, String color) {
        super(decoratedItem);
        this.color = color;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Color: " + color;
    }

    @Override
    public double getPrice() {
        // Additional cost for color
        return super.getPrice() + 5.0;
    }
}
