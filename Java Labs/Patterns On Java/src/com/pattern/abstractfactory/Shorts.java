package com.pattern.abstractfactory;

public class Shorts implements Clothing {
    @Override
    public void getDescription() {
        System.out.println("These are shorts.");
    }
}
