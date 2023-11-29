from com.pattern.facade.OnlineClothingStoreFacade import OnlineClothingStoreFacade

if __name__ == "__main__":
    facade = OnlineClothingStoreFacade()

    # Client code interacts with the simplified interface
    facade.purchase_item("Shirt", 2, 25.0)
    facade.purchase_item("Pants", 1, 35.0)