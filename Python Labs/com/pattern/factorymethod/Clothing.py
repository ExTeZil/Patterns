from abc import ABC, abstractmethod

class Clothing(ABC):
    @abstractmethod
    def get_description(self):
        pass