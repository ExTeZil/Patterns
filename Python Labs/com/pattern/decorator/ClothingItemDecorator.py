from com.pattern.decorator.ClothingItem import ClothingItem


class ClothingItemDecorator(ClothingItem):
    def __init__(self, decorated_item):
        self.decorated_item = decorated_item

    def get_description(self):
        return self.decorated_item.get_description()

    def get_price(self):
        return self.decorated_item.get_price()