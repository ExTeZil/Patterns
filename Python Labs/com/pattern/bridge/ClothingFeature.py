from abc import ABC, abstractmethod


class ClothingFeature(ABC):
    @abstractmethod
    def display_feature(self):
        pass