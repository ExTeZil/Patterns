package com.pattern.factorymethod;

public class PantsFactory implements ClothingFactory {
    @Override
    public Clothing createClothing() {
        return new Pants();
    }
}