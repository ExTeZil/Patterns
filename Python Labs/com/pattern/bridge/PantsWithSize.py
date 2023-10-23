from com.pattern.bridge.ClothingWithFeature import ClothingWithFeature


class PantsWithSize(ClothingWithFeature):
    def display_details(self):
        print("Pants with the following details:")
        self.feature.display_feature()