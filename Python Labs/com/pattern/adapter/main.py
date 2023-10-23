from com.pattern.adapter.InventoryItem import InventoryItem
from com.pattern.adapter.InventoryItemAdapter import InventoryItemAdapter

if __name__ == "__main__":
    inventory_item = InventoryItem("Shirt", "Red", 42)
    clothing_item = InventoryItemAdapter(inventory_item)

    print("Clothing Type:", clothing_item.get_type())
    print("Color:", clothing_item.get_color())
    print("Size:", clothing_item.get_size())