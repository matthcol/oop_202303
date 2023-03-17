from abc import ABC, abstractmethod;

class Form(ABC):

    @abstractmethod
    def translate(self, deltaX: float, deltaY: float)->None:
        """translate form with relative deltas X et Y"""


class Point(Form):

    def __init__(self) -> None:
        self.x = 0
        self.y = 0

    def translate(self, deltaX: float, deltaY: float)->None:
        self.x += deltaX
        self.y += deltaY
