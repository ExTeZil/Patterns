package com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ClothingCollection implements ClothingItem {
    private List<ClothingItem> items = new ArrayList<>();

    public void addClothingItem(ClothingItem item) {
        items.add(item);
    }

    public void removeClothingItem(ClothingItem item) {
        items.remove(item);
    }

    @Override
    public void displayDetails() {
        System.out.println("Clothing Collection:");
        for (ClothingItem item : items) {
            item.displayDetails();
        }
    }
}
