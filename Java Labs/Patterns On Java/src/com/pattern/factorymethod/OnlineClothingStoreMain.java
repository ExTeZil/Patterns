package com.pattern.factorymethod;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        ClothingFactory shirtFactory = new ShirtFactory();
        ClothingFactory pantsFactory = new PantsFactory();
        ClothingFactory dressFactory = new DressFactory();

        Clothing shirt = shirtFactory.createClothing();
        Clothing pants = pantsFactory.createClothing();
        Clothing dress = dressFactory.createClothing();

        shirt.getDescription();
        pants.getDescription();
        dress.getDescription();
    }
}
