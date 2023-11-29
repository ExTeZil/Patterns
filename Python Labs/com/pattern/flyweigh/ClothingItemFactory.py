from com.pattern.flyweigh.SharedClothingItem import SharedClothingItem


class ClothingItemFactory:
    clothing_item_map = {}

    @staticmethod
    def get_shared_clothing_item(item_type):
        if item_type not in ClothingItemFactory.clothing_item_map:
            ClothingItemFactory.clothing_item_map[item_type] = SharedClothingItem(item_type)
        return ClothingItemFactory.clothing_item_map[item_type]