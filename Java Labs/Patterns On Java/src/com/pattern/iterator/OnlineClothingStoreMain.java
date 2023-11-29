package com.pattern.iterator;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        ClothingStore clothingStore = new ClothingStore();
        clothingStore.addItem(new Shirt("Casual Shirt"));
        clothingStore.addItem(new Shirt("Formal Shirt"));

        Iterator iterator = clothingStore.createIterator();

        while (iterator.hasNext()) {
            ClothingItem clothingItem = iterator.next();
            System.out.println("Item: " + clothingItem.getDescription());
        }
    }
}