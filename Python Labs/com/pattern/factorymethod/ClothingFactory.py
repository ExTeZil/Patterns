from abc import ABC, abstractmethod


class ClothingFactory(ABC):
    @abstractmethod
    def create_clothing(self):
        pass