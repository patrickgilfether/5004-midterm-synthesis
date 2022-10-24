/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.4 practical
 CS 5004
 10/13/2022
 *******************************************************************************/

public class Car{
    /*
   class defining a car
   attributes:
       +make: final String
       +model: final String
       +year: final int
       +color: String
       -key: final String
       -gasTank: double
       -milesPerGallon: double
       -numCars: static int

   methods:
       +constructor(make,model,year,color,key)
       +getMake():String
       +getModel():String
       +getYear():int
       +GetColor():String
       +drive( key:int):int
     */


    public final String make;
    public final String model;
    public final int year;
    public String color;
    private int key;

    //additional variables:
    private double gastank;
    private double milesPerGallon;
    private static int numCars = 0 ; //number of cars initially set to 0. This is a static counter and will be incremented by constructor


    /**
     * full arg constructor
     * @param make
     * @param model
     * @param year
     * @param color
     * @param key this lets a user confirm ownership in order to drive the car.
     */
    public Car(String make, String model, int year, String color, int key, double  milesPerGallon) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.key = key;
        this.milesPerGallon = milesPerGallon;
        this.gastank = 30; // 'fill' the gas tank with a default amount
        numCars++; //increment static car counter


    }

    //Begin Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public static int getNumCars() {
        return numCars;
    }

    public double getGastank() {
        return gastank;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }
    //End Getters

    /**
     * toString override sets a default string output so this object can be printed usefully
     * @return string
     */
    @Override
    public String toString() {
        return (color + " " + year + " " +  make + " " + model + " ");
    }

    /**
     * prints the range this car can travel given its fuel capacity at time of invocation.
     */
    public void printRange(){
        double range = TransportationMath.range(gastank,milesPerGallon);
        System.out.println(this + "has " + String.format("%.2f",gastank) + " gallons of gas, providing a range of " + String.format("%.2f",range) + " miles" );
    }

    /**
     * drive() takes a key and distance. calculates fuel cost. decrements gasTank by fuelcost. prints a summary
     * @param key to unlock car
     * @param distance to be travelled
     * @return 1 if success, -1 if wrong key
     */
    public int drive(int key, double distance){
        //confirm key is correct
        if(key != this.key) {
            return -1; //if wrong key, signal an error by returning -1
        }
        double fuelCost = TransportationMath.fuelCost(distance,milesPerGallon);
        gastank -= fuelCost;
        System.out.println(this + "drove " + String.format("%.2f",distance) + " miles and consumed " + String.format("%.2f",fuelCost) + " gallons");
        return 1; //signal success by returning 1.

    }

}