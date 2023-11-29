package com.pattern.flyweigh;

import java.util.HashMap;
import java.util.Map;

public class ClothingItemFactory {
    private static final Map<String, ClothingItem> clothingItemMap = new HashMap<>();

    public static ClothingItem getSharedClothingItem(String type) {
        return clothingItemMap.computeIfAbsent(type, SharedClothingItem::new);
    }
}
