class ClothingStore:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(ClothingStore, cls).__new__(cls)
        return cls._instance

    def display_products(self):
        print("Displaying clothing products...")

    def process_order(self):
        print("Processing clothing order...")

if __name__ == "__main__":
    store1 = ClothingStore()
    store2 = ClothingStore()

    print(store1 is store2)  # True

    store1.display_products()
    store2.process_order()