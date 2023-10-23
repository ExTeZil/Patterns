package com.pattern.prototype;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        ClothingItemRegistry registry = new ClothingItemRegistry();

        ClothingItemPrototype shirt = registry.getPrototype("basic_shirt");
        ClothingItemPrototype pants = registry.getPrototype("jeans");

        ((ShirtPrototype) shirt).setName("Striped Shirt");
        ((ShirtPrototype) shirt).setPrice(24.99);

        ((PantsPrototype) pants).setName("Slim Fit Jeans");
        ((PantsPrototype) pants).setPrice(49.99);

        System.out.println(shirt);
        System.out.println(pants);
    }
}
