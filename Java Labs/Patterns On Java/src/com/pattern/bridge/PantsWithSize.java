package com.pattern.bridge;

public class PantsWithSize extends ClothingWithFeature {
    public PantsWithSize(ClothingFeature feature) {
        super(feature);
    }

    @Override
    public void displayDetails() {
        System.out.println("Pants with the following details:");
        feature.displayFeature();
    }
}
