from com.pattern.composite.ClothingCollection import ClothingCollection
from com.pattern.composite.Dress import Dress
from com.pattern.composite.Pants import Pants
from com.pattern.composite.Shirt import Shirt

if __name__ == "__main__":
    shirt = Shirt()
    pants = Pants()
    dress = Dress()

    summer_collection = ClothingCollection()
    summer_collection.add_clothing_item(shirt)
    summer_collection.add_clothing_item(pants)

    winter_collection = ClothingCollection()
    winter_collection.add_clothing_item(dress)

    clothing_store = ClothingCollection()
    clothing_store.add_clothing_item(summer_collection)
    clothing_store.add_clothing_item(winter_collection)

    clothing_store.display_details()