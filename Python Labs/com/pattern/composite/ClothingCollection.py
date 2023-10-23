from com.pattern.composite.ClothingItem import ClothingItem


class ClothingCollection(ClothingItem):
    def __init__(self):
        self.items = []

    def add_clothing_item(self, item):
        self.items.append(item)

    def remove_clothing_item(self, item):
        self.items.remove(item)

    def display_details(self):
        print("Clothing Collection:")
        for item in self.items:
            item.display_details()