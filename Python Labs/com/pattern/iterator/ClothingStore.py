from com.pattern.iterator.ClothingCollection import ClothingCollection
from com.pattern.iterator.ClothingIterator import ClothingIterator


class ClothingStore(ClothingCollection):
    def __init__(self):
        self.clothing_items = []

    def add_item(self, clothing_item):
        self.clothing_items.append(clothing_item)

    def create_iterator(self):
        return ClothingIterator(self.clothing_items)