package com.pattern.composite;

public class Shirt implements ClothingItem {
    @Override
    public void displayDetails() {
        System.out.println("This is a shirt.");
    }
}
