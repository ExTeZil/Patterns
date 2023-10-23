package com.pattern.prototype;

class ShirtPrototype implements ClothingItemPrototype {
    private String name;
    private double price;

    public ShirtPrototype(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public ClothingItemPrototype clone() {
        return new ShirtPrototype(name, price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Shirt: " + name + ", Price: $" + price;
    }
}
