import imp
from Vehicle import Vehicle

class Car(Vehicle):
    def __init__(self, make, model) -> None:
        super().__init__()
        self.make = make
        self.model = model

    def drive(self, distance):
        return (str(self.make) + " " + str(self.model) + " " + str(super().drive(distance)))
    def move_noise(self):
        return ("*VROOOOOOOOM VROOOOOOOM*")
    def honk(self):
        return ("*BEEP BEEP*")
