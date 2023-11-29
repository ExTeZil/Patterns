package com.pattern.iterator;

import java.util.List;

public class ClothingIterator implements Iterator {
    private List<ClothingItem> clothingItems;
    private int currentIndex;

    public ClothingIterator(List<ClothingItem> clothingItems) {
        this.clothingItems = clothingItems;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < clothingItems.size();
    }

    @Override
    public ClothingItem next() {
        if (hasNext()) {
            ClothingItem currentItem = clothingItems.get(currentIndex);
            currentIndex++;
            return currentItem;
        } else {
            return null;
        }
    }
}