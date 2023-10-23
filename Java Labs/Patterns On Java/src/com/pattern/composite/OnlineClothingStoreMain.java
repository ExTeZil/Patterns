package com.pattern.composite;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        ClothingItem shirt = new Shirt();
        ClothingItem pants = new Pants();
        ClothingItem dress = new Dress();

        ClothingCollection summerCollection = new ClothingCollection();
        summerCollection.addClothingItem(shirt);
        summerCollection.addClothingItem(pants);

        ClothingCollection winterCollection = new ClothingCollection();
        winterCollection.addClothingItem(dress);

        ClothingCollection clothingStore = new ClothingCollection();
        clothingStore.addClothingItem(summerCollection);
        clothingStore.addClothingItem(winterCollection);

        clothingStore.displayDetails();
    }
}
