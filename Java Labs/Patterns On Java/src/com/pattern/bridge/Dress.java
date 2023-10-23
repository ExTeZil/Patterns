package com.pattern.bridge;

public class Dress implements ClothingItem {
    @Override
    public void displayDetails() {
        System.out.println("This is a dress.");
    }
}
