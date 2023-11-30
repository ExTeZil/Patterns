from abc import ABC, abstractmethod

# Mediator interface
class Mediator(ABC):
    @abstractmethod
    def notify(self, sender, event):
        pass