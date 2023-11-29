from com.pattern.proxy.ClothingImage import ClothingImage
from com.pattern.proxy.RealClothingImage import RealClothingImage


class ClothingImageProxy(ClothingImage):
    def __init__(self, image_url):
        self.image_url = image_url
        self.real_image = None

    def display(self):
        if self.real_image is None:
            self.real_image = RealClothingImage(self.image_url)
        self.real_image.display()