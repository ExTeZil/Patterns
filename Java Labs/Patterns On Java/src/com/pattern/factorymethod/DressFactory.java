package com.pattern.factorymethod;

public class DressFactory implements ClothingFactory {
    @Override
    public Clothing createClothing() {
        return new Dress();
    }
}
