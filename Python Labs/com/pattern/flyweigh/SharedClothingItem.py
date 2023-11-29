from com.pattern.flyweigh.ClothingItem import ClothingItem

class SharedClothingItem(ClothingItem):
    def __init__(self, item_type):
        self.item_type = item_type

    def display(self, color):
        print(f"Type: {self.item_type}, Color: {color}")