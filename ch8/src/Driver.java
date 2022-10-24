/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.8 practical
 CS 5004
 10/13/2022
 *******************************************************************************/
public class Driver {

    public static void main(String[] args){
        Bike b1 = new Bike("Specialized","Stumpjumper",1997,"hot pink");
        ElectricCar ec1= new ElectricCar("Tesla", "Model 3", 2021, "blue",4.4, 50);
        GasCar gc1 = new GasCar("Toyota", "Landcruiser", 1992, "gold",13.5, 28.5);
        Bird b2 = new Bird();

        Vehicle[] vehicles = {b1,ec1,gc1}; //array of vehicles, each with it's own implementation of noise interface via overrides
        Noise[] noiseMakers = {b1,ec1,gc1,b2}; //array of noise implementers. check out how we can use this below!

        System.out.println("\n ***using polymorphism to sound all vehicles***\n");

        for (Vehicle v : vehicles){
            System.out.println(v.getClass().getName() +" goes:");
            v.driveNoise();
            v.honk();
            System.out.println();
        }

        System.out.println("\n\n");

        //this is pretty cool-- the bird class we've added implements noise, but has nothing to do with vehicles.
        //by using an array of Noise[] we can invoke all noise methods polymorphically!

        System.out.println("\n ***using polymorphism to sound all noise makers***\n");

        for (Noise n : noiseMakers){
            System.out.println(n.getClass().getName() +" goes:");
            n.driveNoise();
            n.honk();
            System.out.println();
        }
    }


}
