package com.pattern.iterator;

public class Shirt implements ClothingItem {
    private String description;

    public Shirt(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
