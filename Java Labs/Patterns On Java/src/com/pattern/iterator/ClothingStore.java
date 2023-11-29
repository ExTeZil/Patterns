package com.pattern.iterator;


import java.util.ArrayList;
import java.util.List;

public class ClothingStore implements ClothingCollection {
    private List<ClothingItem> clothingItems;

    public ClothingStore() {
        this.clothingItems = new ArrayList<>();
    }

    public void addItem(ClothingItem clothingItem) {
        clothingItems.add(clothingItem);
    }

    @Override
    public Iterator createIterator() {
        return new ClothingIterator(clothingItems);
    }
}
