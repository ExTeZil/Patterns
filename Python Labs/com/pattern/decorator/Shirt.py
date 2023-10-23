from com.pattern.decorator.ClothingItem import ClothingItem


class Shirt(ClothingItem):
    def get_description(self):
        return "This is a shirt."

    def get_price(self):
        return 20.0