from com.pattern.objectpool.ClothingItemPool import ClothingItemPool

if __name__ == "__main__":
    pool = ClothingItemPool()

    item1 = pool.borrow_item()
    item2 = pool.borrow_item()

    print("Item 1:", item1.item_type)
    print("Item 2:", item2.item_type)

    pool.return_item(item1)
    pool.return_item(item2)

    item3 = pool.borrow_item()
    print("Item 3:", item3.item_type)