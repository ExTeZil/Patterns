from com.pattern.proxy.ClothingImageProxy import ClothingImageProxy

if __name__ == "__main__":
    # Using the proxy to control access to the real object
    image1 = ClothingImageProxy("image1.jpg")
    image2 = ClothingImageProxy("image2.jpg")

    # The real image is loaded only when required
    image1.display()
    image2.display()