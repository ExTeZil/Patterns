from com.pattern.abstractfactory.ClothingFactory import ClothingFactory
from com.pattern.abstractfactory.Pants import Pants
from com.pattern.abstractfactory.Sweater import Sweater


class WinterClothingFactory(ClothingFactory):
    def create_top(self):
        return Sweater()

    def create_bottom(self):
        return Pants()