from com.pattern.decorator.ClothingItemDecorator import ClothingItemDecorator


class ColorDecorator(ClothingItemDecorator):
    def __init__(self, decorated_item, color):
        super().__init__(decorated_item)
        self.color = color

    def get_description(self):
        return super().get_description() + f" Color: {self.color}"

    def get_price(self):
        return super().get_price() + 5.0  # Additional cost for color