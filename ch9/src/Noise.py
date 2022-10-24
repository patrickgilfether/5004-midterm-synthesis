'''
I've used a stub class as an alternative to an interface for establishing polymorphism
This works because python will let me establish multiple inheiritance
'''
class Noise:
    #no constructor, since I'll use this class as an 'abstract class'
    
    def move_noise(self):
        pass 
    def honk(self):
        pass   