/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.6 practical
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
       -odometer: double

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
    private double gastank;
    private double milesPerGallon;
    private double odometer;
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
        //exception handling added for illegal year or mpg
        if(year<1886) throw new IllegalArgumentException("Cars weren't invented yet, silly!");
        if(milesPerGallon<=0) throw new IllegalArgumentException("MPG must be >0 due to entropy, man.");
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

    public double getOdometer() {
        return odometer;
    }
    //End Getters

    //Begin Setters

    /**
     * helper function used to ensure that fuelCost in question is legal before setting
     * @throws IllegalArgumentException if fuelCost negative
     * @param fuelCost
     */
    private void setGastank(double fuelCost) {
        if (fuelCost <0) throw new IllegalArgumentException("fuel cost cannot be negative");
        this.gastank -= fuelCost;
    }
    //helper function used to ensure that distance in question is legal

    /**
     * helper function used to ensure that distance in question is legal
     * @throws IllegalArgumentException if distance is negative
     * @param traveled representing distance traveled by car
     */
    private void setOdometer(double traveled) {
        if (traveled <0) throw new IllegalArgumentException("distance travelled cannot be negative");
        this.odometer += traveled;
    }
    //end setters

    /**
     * helper function used to ensure that key used is correct key.
     * @throws SecurityException if wrong key used
     * @param usedKey
     */
    private void checkKey(int usedKey){
        if(usedKey != this.key) {
            throw new SecurityException("key passed in is not the correct key for this vehicle");
        }
    }

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
     */
    public void drive(int key, double distance){
        //confirm key is correct
        checkKey(key);
        double fuelCost = TransportationMath.fuelCost(distance,milesPerGallon);
        setGastank(fuelCost);
        setOdometer(distance);
        System.out.println(this + "drove " + String.format("%.2f",distance) + " miles and consumed " + String.format("%.2f",fuelCost) + " gallons");
    }

}