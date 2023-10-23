package com.pattern.abstractfactory;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        ClothingFactory summerFactory = new SummerClothingFactory();
        ClothingFactory winterFactory = new WinterClothingFactory();

        Clothing summerTop = summerFactory.createTop();
        Clothing summerBottom = summerFactory.createBottom();

        Clothing winterTop = winterFactory.createTop();
        Clothing winterBottom = winterFactory.createBottom();

        summerTop.getDescription();
        summerBottom.getDescription();

        winterTop.getDescription();
        winterBottom.getDescription();
    }
}
