package com.pattern.adapter;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        InventoryItem inventoryItem = new InventoryItem("Shirt", "Red", 42);
        ClothingItem clothingItem = new InventoryItemAdapter(inventoryItem);

        System.out.println("Clothing Type: " + clothingItem.getType());
        System.out.println("Color: " + clothingItem.getColor());
        System.out.println("Size: " + clothingItem.getSize());
    }
}
