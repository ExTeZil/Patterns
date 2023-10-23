package com.pattern.abstractfactory;

public class SummerClothingFactory implements ClothingFactory {
    @Override
    public Clothing createTop() {
        return new Shirt();
    }

    @Override
    public Clothing createBottom() {
        return new Shorts();
    }
}

