/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.7 practical
 CS 5004
 10/13/2022
 *******************************************************************************/
public abstract class Vehicle {
    public final String make;
    public final String model;
    public final int year;
    public String color;

    /**
     * Constructor
     * @param make
     * @param model
     * @param year
     * @param color
     */
    public Vehicle(String make, String model, int year, String color) {
        //exception handling added for illegal year or mpg
        if(year<0) throw new IllegalArgumentException("Year cannot be negative");
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
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

    //End Getters

    public abstract void drive(double distance);

    /**
     * toString override sets a default string output so this object can be printed usefully
     * @return string
     */
    @Override
    public String toString() {
        return (color + " " + year + " " +  make + " " + model + " ");
    }

}
