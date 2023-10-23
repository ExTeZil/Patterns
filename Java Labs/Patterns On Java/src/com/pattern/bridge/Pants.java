package com.pattern.bridge;

public class Pants implements ClothingItem {
    @Override
    public void displayDetails() {
        System.out.println("These are pants.");
    }
}
