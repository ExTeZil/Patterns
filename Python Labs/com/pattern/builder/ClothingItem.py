class ClothingItem:
    def __init__(self, type, color, size):
        self.type = type
        self.color = color
        self.size = size

    def __str__(self):
        return f'ClothingItem [type: {self.type}, color: {self.color}, size: {self.size}]'