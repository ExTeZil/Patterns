from com.pattern.factorymethod.DressFactory import DressFactory
from com.pattern.factorymethod.PantsFactory import PantsFactory
from com.pattern.factorymethod.ShirtFactory import ShirtFactory

if __name__ == "__main__":
    shirt_factory = ShirtFactory()
    pants_factory = PantsFactory()
    dress_factory = DressFactory()

    shirt = shirt_factory.create_clothing()
    pants = pants_factory.create_clothing()
    dress = dress_factory.create_clothing()

    print(shirt.get_description())
    print(pants.get_description())
    print(dress.get_description())