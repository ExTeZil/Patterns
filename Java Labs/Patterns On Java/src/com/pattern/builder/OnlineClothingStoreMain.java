package com.pattern.builder;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        ClothingItem shirt = new ClothingItemBuilder()
                .setType("Shirt")
                .setColor("Red")
                .setSize(42)
                .build();

        ClothingItem pants = new ClothingItemBuilder()
                .setType("Pants")
                .setColor("Blue")
                .setSize(32)
                .build();

        System.out.println(shirt);
        System.out.println(pants);
    }
}
