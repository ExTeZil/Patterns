package com.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class ClothingItemRegistry {
    private Map<String, ClothingItemPrototype> prototypes = new HashMap<>();

    public ClothingItemRegistry() {
        addPrototype("basic_shirt", new ShirtPrototype("Basic Shirt", 19.99));
        addPrototype("jeans", new PantsPrototype("Jeans", 39.99));
    }

    public void addPrototype(String key, ClothingItemPrototype prototype) {
        prototypes.put(key, prototype);
    }

    public ClothingItemPrototype getPrototype(String key) {
        return prototypes.get(key).clone();
    }
}
