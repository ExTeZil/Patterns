from com.pattern.adapter.ClothingItem import ClothingItem


class InventoryItemAdapter(ClothingItem):
    def __init__(self, inventory_item):
        self.inventory_item = inventory_item

    def get_type(self):
        # Assuming that the type in the clothing store is the same as the name in the inventory system
        return self.inventory_item.get_name()

    def get_color(self):
        return self.inventory_item.get_item_color()

    def get_size(self):
        return self.inventory_item.get_item_size()