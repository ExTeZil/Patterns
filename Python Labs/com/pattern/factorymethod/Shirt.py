from com.pattern.factorymethod.Clothing import Clothing


class Shirt(Clothing):
    def get_description(self):
        return "This is a shirt."