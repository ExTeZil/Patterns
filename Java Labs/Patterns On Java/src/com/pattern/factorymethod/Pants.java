package com.pattern.factorymethod;

public class Pants implements Clothing {
    @Override
    public void getDescription() {
        System.out.println("These are pants.");
    }
}