package com.pattern.singletone;

public class ClothingStore {
    private static ClothingStore instance;
    private String value;

    private ClothingStore(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static ClothingStore getInstance(String value) {
        if (instance == null) {
            instance = new ClothingStore(value);
        }
        return instance;
    }

}
