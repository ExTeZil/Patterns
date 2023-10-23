package com.pattern.bridge;

public abstract class ClothingWithFeature implements ClothingItem {
    protected ClothingFeature feature;

    public ClothingWithFeature(ClothingFeature feature) {
        this.feature = feature;
    }

    @Override
    public abstract void displayDetails();
}
