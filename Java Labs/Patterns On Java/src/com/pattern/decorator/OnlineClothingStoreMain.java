package com.pattern.decorator;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        ClothingItem shirt = new Shirt();
        ClothingItem pants = new Pants();

        shirt = new ColorDecorator(shirt, "Red");
        pants = new SizeDecorator(pants, 32);

        System.out.println(shirt.getDescription() + ", Price: $" + shirt.getPrice());
        System.out.println(pants.getDescription() + ", Price: $" + pants.getPrice());
    }
}