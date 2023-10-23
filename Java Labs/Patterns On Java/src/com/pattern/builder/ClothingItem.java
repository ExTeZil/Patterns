package com.pattern.builder;

public class ClothingItem {
    private String type;
    private String color;
    private int size;

    public ClothingItem(String type, String color, int size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "ClothingItem [type=" + type + ", color=" + color + ", size=" + size + "]";
    }
}
