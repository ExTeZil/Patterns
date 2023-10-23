from com.pattern.factorymethod.ClothingFactory import ClothingFactory
from com.pattern.factorymethod.Dress import Dress


class DressFactory(ClothingFactory):
    def create_clothing(self):
        return Dress()