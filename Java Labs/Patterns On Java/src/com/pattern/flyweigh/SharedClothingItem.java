package com.pattern.flyweigh;

public class SharedClothingItem implements ClothingItem {
    private String type;

    public SharedClothingItem(String type) {
        this.type = type;
    }

    @Override
    public void display(String color) {
        System.out.println("Type: " + type + ", Color: " + color);
    }
}
