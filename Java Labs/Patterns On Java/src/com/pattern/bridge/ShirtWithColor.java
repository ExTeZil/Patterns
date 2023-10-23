package com.pattern.bridge;

public class ShirtWithColor extends ClothingWithFeature {
    public ShirtWithColor(ClothingFeature feature) {
        super(feature);
    }

    @Override
    public void displayDetails() {
        System.out.println("Shirt with the following details:");
        feature.displayFeature();
    }
}