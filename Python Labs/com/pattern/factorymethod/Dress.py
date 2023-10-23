from com.pattern.factorymethod.Clothing import Clothing


class Dress(Clothing):
    def get_description(self):
        return "This is a dress."