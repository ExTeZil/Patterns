from com.pattern.objectpool.ClothingItem import ClothingItem


class ClothingItemPool:
    def __init__(self):
        self.available_items = []
        self.in_use_items = []

        # Initialize the pool with some clothing items
        for _ in range(10):
            self.available_items.append(ClothingItem("Generic"))

    def borrow_item(self):
        if not self.available_items:
            # If no available items, create a new one or handle accordingly
            print("No available clothing items. Creating a new one.")
            return ClothingItem("Generic")
        else:
            item = self.available_items.pop(0)
            self.in_use_items.append(item)
            return item

    def return_item(self, item):
        item.return_item_to_pool()
        self.in_use_items.remove(item)
        self.available_items.append(item)