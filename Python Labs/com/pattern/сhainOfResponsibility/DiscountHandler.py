from abc import ABC, abstractmethod


class DiscountHandler(ABC):
    @abstractmethod
    def set_next_handler(self, next_handler):
        pass

    @abstractmethod
    def apply_discount(self, order):
        pass
