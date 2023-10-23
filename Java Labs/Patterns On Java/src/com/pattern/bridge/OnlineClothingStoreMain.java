package com.pattern.bridge;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        ClothingFeature redColor = new ColorFeature("Red");
        ClothingFeature size42 = new SizeFeature(42);

        ClothingItem shirtWithColor = new ShirtWithColor(redColor);
        ClothingItem pantsWithSize = new PantsWithSize(size42);

        shirtWithColor.displayDetails();
        pantsWithSize.displayDetails();
    }
}