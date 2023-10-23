from com.pattern.abstractfactory.ClothingFactory import ClothingFactory
from com.pattern.abstractfactory.Shorts import Dress
from com.pattern.abstractfactory.Shirt import Shirt


class SummerClothingFactory(ClothingFactory):
    def create_top(self):
        return Shirt()

    def create_bottom(self):
        return Dress()