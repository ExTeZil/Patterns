package com.pattern.decorator;

public class Shirt implements ClothingItem {
    @Override
    public String getDescription() {
        return "This is a shirt.";
    }

    @Override
    public double getPrice() {
        return 20.0;
    }
}