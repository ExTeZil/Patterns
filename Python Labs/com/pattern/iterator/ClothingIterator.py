from com.pattern.iterator.Iterator import Iterator


class ClothingIterator(Iterator):
    def __init__(self, clothing_items):
        self.clothing_items = clothing_items
        self.current_index = 0

    def has_next(self):
        return self.current_index < len(self.clothing_items)

    def next(self):
        if self.has_next():
            current_item = self.clothing_items[self.current_index]
            self.current_index += 1
            return current_item
        else:
            return None