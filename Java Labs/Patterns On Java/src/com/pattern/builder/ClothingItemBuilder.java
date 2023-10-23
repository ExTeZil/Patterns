package com.pattern.builder;

public class ClothingItemBuilder {
    private String type;
    private String color;
    private int size;

    public ClothingItemBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public ClothingItemBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public ClothingItemBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public ClothingItem build() {
        return new ClothingItem(type, color, size);
    }
}
