from com.pattern.factorymethod.ClothingFactory import ClothingFactory
from com.pattern.factorymethod.Pants import Pants


class PantsFactory(ClothingFactory):
    def create_clothing(self):
        return Pants()