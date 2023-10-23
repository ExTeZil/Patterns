from com.pattern.builder.ClothingItemBuilder import ClothingItemBuilder

if __name__ == "__main__":
    shirt = ClothingItemBuilder() \
        .set_type("Shirt") \
        .set_color("Red") \
        .set_size(42) \
        .build()

    pants = ClothingItemBuilder() \
        .set_type("Pants") \
        .set_color("Blue") \
        .set_size(32) \
        .build()

    print(shirt)
    print(pants)