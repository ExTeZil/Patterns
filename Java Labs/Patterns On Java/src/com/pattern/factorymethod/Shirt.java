package com.pattern.factorymethod;

public class Shirt implements Clothing {
    @Override
    public void getDescription() {
        System.out.println("This is a shirt.");
    }
}