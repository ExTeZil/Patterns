from com.pattern.decorator.ColorDecorator import ColorDecorator
from com.pattern.decorator.Pants import Pants
from com.pattern.decorator.Shirt import Shirt
from com.pattern.decorator.SizeDecorator import SizeDecorator

if __name__ == "__main__":
    shirt = Shirt()
    pants = Pants()

    shirt = ColorDecorator(shirt, "Red")
    pants = SizeDecorator(pants, 32)

    print(f"{shirt.get_description()}, Price: ${shirt.get_price()}")
    print(f"{pants.get_description()}, Price: ${pants.get_price()}")