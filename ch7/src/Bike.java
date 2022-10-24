/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.7 practical
 CS 5004
 10/13/2022
 *******************************************************************************/
public class Bike extends Vehicle{
    public Bike(String make, String model, int year, String color) {
        super(make, model, year, color);
    }
    public void drive (double distance) {
        System.out.println(this + "rode " + String.format("%.2f",distance) + " miles on nothing but pizza and french fries");
    }

}
