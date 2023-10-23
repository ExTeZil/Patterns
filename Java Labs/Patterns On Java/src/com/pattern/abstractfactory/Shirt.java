package com.pattern.abstractfactory;

public class Shirt implements Clothing {
    @Override
    public void getDescription() {
        System.out.println("This is a shirt.");
    }
}
