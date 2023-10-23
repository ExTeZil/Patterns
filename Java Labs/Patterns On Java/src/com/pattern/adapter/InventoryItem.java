package com.pattern.adapter;

public class InventoryItem {
    private String name;
    private String itemColor;
    private int itemSize;

    public InventoryItem(String name, String itemColor, int itemSize) {
        this.name = name;
        this.itemColor = itemColor;
        this.itemSize = itemSize;
    }

    public String getName() {
        return name;
    }

    public String getItemColor() {
        return itemColor;
    }

    public int getItemSize() {
        return itemSize;
    }
}
