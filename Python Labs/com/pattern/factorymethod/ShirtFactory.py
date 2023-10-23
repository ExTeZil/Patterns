from com.pattern.factorymethod.ClothingFactory import ClothingFactory
from com.pattern.factorymethod.Shirt import Shirt


class ShirtFactory(ClothingFactory):
    def create_clothing(self):
        return Shirt()