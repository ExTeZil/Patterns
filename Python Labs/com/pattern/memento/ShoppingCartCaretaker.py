class ShoppingCartCaretaker:
    def __init__(self):
        self.memento_stack = []

    def save_memento(self, memento):
        self.memento_stack.append(memento)

    def undo(self):
        if self.memento_stack:
            return self.memento_stack.pop()
        else:
            return None