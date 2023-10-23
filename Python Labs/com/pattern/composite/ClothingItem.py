from abc import ABC, abstractmethod

class ClothingItem(ABC):
    @abstractmethod
    def display_details(self):
        pass