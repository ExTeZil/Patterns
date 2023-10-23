from com.pattern.bridge.ClothingWithFeature import ClothingWithFeature


class ShirtWithColor(ClothingWithFeature):
    def display_details(self):
        print("Shirt with the following details:")
        self.feature.display_feature()