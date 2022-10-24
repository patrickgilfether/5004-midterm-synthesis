from Noise import Noise


class Vehicle(Noise):
    def drive(self, distance):
        return("drove " + str(distance) + " miles")
