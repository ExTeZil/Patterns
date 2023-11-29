from com.pattern.proxy.ClothingImage import ClothingImage


class RealClothingImage(ClothingImage):
    def __init__(self, image_url):
        self.image_url = image_url
        self.load_image_from_disk()

    def load_image_from_disk(self):
        print(f"Loading image from disk: {self.image_url}")

    def display(self):
        print(f"Displaying image: {self.image_url}")