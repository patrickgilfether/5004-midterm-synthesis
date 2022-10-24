from Bird import Bird
from Noise import Noise
from Car  import Car


b1 = Bird()
c1 = Car("Tesla","Model 3")
c2 = Car("Subaru", "Outback")
noiseMakers = [b1,c1]
cars = [c1,c2]

for n in noiseMakers:
    print((str)(n.__class__) +  " makes the noise:")
    print(n.move_noise())
    print(n.honk())
    print("\n")

for c in cars:
    # print((str)(c.__class__) +  " makes the noise:")
    print(c.move_noise())
    print(c.drive(25))
    print("\n")

print(b1.lay_egg())