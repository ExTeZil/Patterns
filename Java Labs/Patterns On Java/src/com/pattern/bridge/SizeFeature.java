package com.pattern.bridge;

public class SizeFeature implements ClothingFeature {
    private int size;

    public SizeFeature(int size) {
        this.size = size;
    }

    @Override
    public void displayFeature() {
        System.out.println("Size: " + size);
    }
}
