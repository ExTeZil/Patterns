package com.pattern.proxy;

public class RealClothingImage implements ClothingImage {
    private String imageUrl;

    public RealClothingImage(String imageUrl) {
        this.imageUrl = imageUrl;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk: " + imageUrl);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imageUrl);
    }
}
