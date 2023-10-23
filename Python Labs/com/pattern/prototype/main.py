import copy

class ClothingItemPrototype:
    def clone(self):
        return copy.deepcopy(self)

class ShirtPrototype(ClothingItemPrototype):
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def __str__(self):
        return f"Shirt: {self.name}, Price: ${self.price:.2f}"

class PantsPrototype(ClothingItemPrototype):
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def __str__(self):
        return f"Pants: {self.name}, Price: ${self.price:.2f}"

class ClothingItemRegistry:
    def __init__(self):
        self.prototypes = {}

    def add_prototype(self, key, prototype):
        self.prototypes[key] = prototype

    def get_prototype(self, key):
        return self.prototypes[key].clone()

if __name__ == "__main__":
    registry = ClothingItemRegistry()

    registry.add_prototype("basic_shirt", ShirtPrototype("Basic Shirt", 19.99))
    registry.add_prototype("jeans", PantsPrototype("Jeans", 39.99))

    shirt = registry.get_prototype("basic_shirt")
    pants = registry.get_prototype("jeans")

    shirt.name = "Striped Shirt"
    shirt.price = 24.99

    pants.name = "Slim Fit Jeans"
    pants.price = 49.99

    print(shirt)
    print(pants)