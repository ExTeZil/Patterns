from com.pattern.bridge.ClothingFeature import ClothingFeature


class ColorFeature(ClothingFeature):
    def __init__(self, color):
        self.color = color

    def display_feature(self):
        print("Color:", self.color)