from abc import ABC, abstractmethod

# Subject interface
class ClothingImage(ABC):
    @abstractmethod
    def display(self):
        pass