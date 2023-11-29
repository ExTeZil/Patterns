from abc import ABC, abstractmethod


class ClothingCollection(ABC):
    @abstractmethod
    def create_iterator(self):
        pass