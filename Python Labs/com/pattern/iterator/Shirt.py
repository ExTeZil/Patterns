from com.pattern.iterator.ClothingItem import ClothingItem


class Shirt(ClothingItem):
    def __init__(self, description):
        self.description = description

    def get_description(self):
        return self.description