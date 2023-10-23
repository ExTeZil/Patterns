package com.pattern.abstractfactory;

public class Sweater implements Clothing {
    @Override
    public void getDescription() {
        System.out.println("This is a sweater.");
    }
}
