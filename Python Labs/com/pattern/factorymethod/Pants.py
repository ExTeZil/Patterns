from com.pattern.factorymethod.Clothing import Clothing


class Pants(Clothing):
    def get_description(self):
        return "These are pants."