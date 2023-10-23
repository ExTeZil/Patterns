from com.pattern.decorator.ClothingItemDecorator import ClothingItemDecorator


class SizeDecorator(ClothingItemDecorator):
    def __init__(self, decorated_item, size):
        super().__init__(decorated_item)
        self.size = size

    def get_description(self):
        return super().get_description() + f" Size: {self.size}"

    def get_price(self):
        return super().get_price() + 10.0  # Additional cost for size