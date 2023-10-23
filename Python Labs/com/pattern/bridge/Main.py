from com.pattern.bridge.ColorFeature import ColorFeature
from com.pattern.bridge.PantsWithSize import PantsWithSize
from com.pattern.bridge.ShirtWithColor import ShirtWithColor
from com.pattern.bridge.SizeFeature import SizeFeature

if __name__ == "__main__":
    red_color = ColorFeature("Red")
    size_42 = SizeFeature(42)

    shirt_with_color = ShirtWithColor(red_color)
    pants_with_size = PantsWithSize(size_42)

    shirt_with_color.display_details()
    pants_with_size.display_details()