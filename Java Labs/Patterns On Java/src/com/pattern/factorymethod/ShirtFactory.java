package com.pattern.factorymethod;

public class ShirtFactory implements ClothingFactory {
    @Override
    public Clothing createClothing() {
        return new Shirt();
    }
}
