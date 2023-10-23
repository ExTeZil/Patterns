package com.pattern.objectpool;

public class ClothingItem {
    private String type;

    public ClothingItem(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void returnItemToPool() {
        // Reset any state if necessary
    }
}
