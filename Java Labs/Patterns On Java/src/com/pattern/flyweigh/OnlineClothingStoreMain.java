package com.pattern.flyweigh;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        ClothingItem shirt1 = ClothingItemFactory.getSharedClothingItem("Shirt");
        ClothingItem shirt2 = ClothingItemFactory.getSharedClothingItem("Shirt");
        ClothingItem pants = ClothingItemFactory.getSharedClothingItem("Pants");

        shirt1.display("Red");
        shirt2.display("Blue");
        pants.display("Black");
    }
}
