package com.pattern.proxy;

public class ClothingImageProxy implements ClothingImage {
    private RealClothingImage realImage;
    private String imageUrl;

    public ClothingImageProxy(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealClothingImage(imageUrl);
        }
        realImage.display();
    }
}
