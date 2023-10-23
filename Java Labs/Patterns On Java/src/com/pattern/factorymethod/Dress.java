package com.pattern.factorymethod;

public class Dress implements Clothing {
    @Override
    public void getDescription() {
        System.out.println("This is a dress.");
    }
}
