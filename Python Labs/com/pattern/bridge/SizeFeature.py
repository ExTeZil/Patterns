from com.pattern.bridge.ClothingFeature import ClothingFeature


class SizeFeature(ClothingFeature):
    def __init__(self, size):
        self.size = size

    def display_feature(self):
        print("Size:", self.size)