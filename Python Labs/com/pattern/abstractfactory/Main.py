from com.pattern.abstractfactory.SummerClothingFactory import SummerClothingFactory
from com.pattern.abstractfactory.WinterClothingFactory import WinterClothingFactory

if __name__ == "__main__":
    summer_factory = SummerClothingFactory()
    winter_factory = WinterClothingFactory()

    summer_top = summer_factory.create_top()
    summer_bottom = summer_factory.create_bottom()

    winter_top = winter_factory.create_top()
    winter_bottom = winter_factory.create_bottom()

    print(summer_top.get_description())
    print(summer_bottom.get_description())
    print(winter_top.get_description())
    print(winter_bottom.get_description())