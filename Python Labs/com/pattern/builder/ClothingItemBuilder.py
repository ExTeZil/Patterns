from com.pattern.builder.ClothingItem import ClothingItem


class ClothingItemBuilder:
    def __init__(self):
        self.type = None
        self.color = None
        self.size = None

    def set_type(self, type):
        self.type = type
        return self

    def set_color(self, color):
        self.color = color
        return self

    def set_size(self, size):
        self.size = size
        return self

    def build(self):
        return ClothingItem(self.type, self.color, self.size)