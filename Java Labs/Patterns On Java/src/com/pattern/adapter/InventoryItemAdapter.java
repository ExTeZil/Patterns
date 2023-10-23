package com.pattern.adapter;

public class InventoryItemAdapter implements ClothingItem {
    private InventoryItem inventoryItem;

    public InventoryItemAdapter(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    @Override
    public String getType() {
        // Assuming that the type in the clothing store is the same as the name in the inventory system
        return inventoryItem.getName();
    }

    @Override
    public String getColor() {
        return inventoryItem.getItemColor();
    }

    @Override
    public int getSize() {
        return inventoryItem.getItemSize();
    }
}
