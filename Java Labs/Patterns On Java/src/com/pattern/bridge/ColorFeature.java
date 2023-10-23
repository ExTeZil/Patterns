package com.pattern.bridge;

public class ColorFeature implements ClothingFeature {
    private String color;

    public ColorFeature(String color) {
        this.color = color;
    }

    @Override
    public void displayFeature() {
        System.out.println("Color: " + color);
    }
}
