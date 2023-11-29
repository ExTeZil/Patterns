package com.pattern.proxy;

public class OnlineClothingStoreMain {
    public static void main(String[] args) {
        // Using the proxy to control access to the real object
        ClothingImage image1 = new ClothingImageProxy("image1.jpg");
        ClothingImage image2 = new ClothingImageProxy("image2.jpg");

        // The real image is loaded only when required
        image1.display();
        image2.display();
    }
}
