from com.pattern.bridge.ClothingItem import ClothingItem


class ClothingWithFeature(ClothingItem):
    def __init__(self, feature):
        self.feature = feature

    def display_details(self):
        pass