from com.pattern.iterator.ClothingStore import ClothingStore
from com.pattern.iterator.Shirt import Shirt

if __name__ == "__main__":
    clothing_store = ClothingStore()
    clothing_store.add_item(Shirt("Casual Shirt"))
    clothing_store.add_item(Shirt("Formal Shirt"))

    iterator = clothing_store.create_iterator()

    while iterator.has_next():
        clothing_item = iterator.next()
        print("Item:", clothing_item.get_description())