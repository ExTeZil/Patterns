package com.pattern.objectpool;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        ClothingItemPool pool = new ClothingItemPool();

        ClothingItem item1 = pool.borrowItem();
        ClothingItem item2 = pool.borrowItem();

        System.out.println("Item 1: " + item1.getType());
        System.out.println("Item 2: " + item2.getType());

        pool.returnItem(item1);
        pool.returnItem(item2);

        ClothingItem item3 = pool.borrowItem();
        System.out.println("Item 3: " + item3.getType());
    }
}
