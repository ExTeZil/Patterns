from abc import ABC, abstractmethod

# Aggregate interface
class ClothingItem(ABC):
    @abstractmethod
    def get_description(self):
        pass