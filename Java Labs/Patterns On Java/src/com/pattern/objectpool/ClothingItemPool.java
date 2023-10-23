package com.pattern.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ClothingItemPool {
    private List<ClothingItem> availableItems = new ArrayList<>();
    private List<ClothingItem> inUseItems = new ArrayList<>();

    public ClothingItemPool() {
        // Initialize the pool with some clothing items
        for (int i = 0; i < 10; i++) {
            availableItems.add(new ClothingItem("Generic"));
        }
    }

    public ClothingItem borrowItem() {
        if (availableItems.isEmpty()) {
            // If no available items, create a new one or handle accordingly
            System.out.println("No available clothing items. Creating a new one.");
            return new ClothingItem("Generic");
        } else {
            ClothingItem item = availableItems.remove(0);
            inUseItems.add(item);
            return item;
        }
    }

    public void returnItem(ClothingItem item) {
        item.returnItemToPool();
        inUseItems.remove(item);
        availableItems.add(item);
    }
}
