/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.7 practical
 CS 5004
 10/13/2022
 *******************************************************************************/
public class Driver {

    public static void main(String[] args){
        Bike b1 = new Bike("Specialized","Stumpjumper",1997,"hot pink");
        ElectricCar ec1= new ElectricCar("Tesla", "Model 3", 2021, "blue",4.4, 50);
        GasCar gc1 = new GasCar("Toyota", "Landcruiser", 1992, "gold",13.5, 28.5);
        FuelSource servicePlaza = new FuelSource(800000000);

        Vehicle[] vehicles = {b1,ec1,gc1};
        MotorVehicle[] motors = {ec1, gc1};

        System.out.println("\n ***using polymorphism to drive all vehicles***\n");

        for (Vehicle v : vehicles){
            v.drive(10);
        }

        System.out.println("\n\n");

        System.out.println("\n ***using polymorphism to drive and refuel all motorvehicles***");
        for (MotorVehicle mv : motors){

            System.out.println("\n**Before Drive:" + mv + "\n");
            mv.drive(200);
            System.out.println("\n**After Drive:" + mv + "\n");
            mv.getFuelSource().refuel(servicePlaza); //notice the service plaza can refuel both types of fuel sources
            System.out.println("**After refueling:" + mv+ "\n");
        }

    }


}
