package com.pattern.singletone;

public class Main {
    public static void main(String[] args) {
        ClothingStore store1 = ClothingStore.getInstance("value1");
        ClothingStore store2 = ClothingStore.getInstance("value2");
        System.out.println(store1.getValue());
        System.out.println(store2.getValue());
    }
}