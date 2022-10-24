from Noise import Noise


class Bird(Noise):
    def __init__(self):
        pass
    
    def move_noise(self):
        return ("*flap flap flap flap flap flap*")
    def honk(self):
        return("*tweedee-dee tweeedeee-deee*")
        
    def lay_egg(self):
        return(str(self) + " laid an egg")

    def __str__(self) -> str:
        return ("lil burb")
        