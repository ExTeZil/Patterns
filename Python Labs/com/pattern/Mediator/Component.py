from abc import ABC, abstractmethod


class Component(ABC):
    @abstractmethod
    def set_mediator(self, mediator):
        pass
    
    @abstractmethod
    def notify(self, event):
        pass