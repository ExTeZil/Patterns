from abc import ABC, abstractmethod

class ClothingItem(ABC):
    @abstractmethod
    def get_description(self):
        pass

    @abstractmethod
    def get_price(self):
        pass