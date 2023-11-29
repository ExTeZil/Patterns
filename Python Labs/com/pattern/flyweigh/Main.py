from com.pattern.flyweigh.ClothingItemFactory import ClothingItemFactory

if __name__ == "__main__":
    shirt1 = ClothingItemFactory.get_shared_clothing_item("Shirt")
    shirt2 = ClothingItemFactory.get_shared_clothing_item("Shirt")
    pants = ClothingItemFactory.get_shared_clothing_item("Pants")

    shirt1.display("Red")
    shirt2.display("Blue")
    pants.display("Black")