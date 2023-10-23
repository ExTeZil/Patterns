class InventoryItem:
    def __init__(self, name, item_color, item_size):
        self.name = name
        self.item_color = item_color
        self.item_size = item_size

    def get_name(self):
        return self.name

    def get_item_color(self):
        return self.item_color

    def get_item_size(self):
        return self.item_size