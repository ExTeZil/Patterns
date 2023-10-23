from abc import ABC, abstractmethod


class ClothingFactory(ABC):
    @abstractmethod
    def create_top(self):
        pass

    @abstractmethod
    def create_bottom(self):
        pass