package com.pattern.decorator;

public class Pants implements ClothingItem {
    @Override
    public String getDescription() {
        return "These are pants.";
    }

    @Override
    public double getPrice() {
        return 30.0;
    }
}
