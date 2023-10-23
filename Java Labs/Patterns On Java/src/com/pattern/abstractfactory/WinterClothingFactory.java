package com.pattern.abstractfactory;

public class WinterClothingFactory implements ClothingFactory {
    @Override
    public Clothing createTop() {
        return new Sweater();
    }

    @Override
    public Clothing createBottom() {
        return new Pants();
    }
}
