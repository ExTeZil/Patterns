from com.pattern.decorator.ClothingItem import ClothingItem


class Pants(ClothingItem):
    def get_description(self):
        return "These are pants."

    def get_price(self):
        return 30.0