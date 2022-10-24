/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.7 practical
 CS 5004
 10/13/2022
 *******************************************************************************/
public class GasCar extends MotorVehicle{
    public GasCar(String make, String model, int year, String color, double mpg, double tankSize) {
        super(make, model, year, color, mpg);
        this.fuelSource = new GasTank(tankSize);
    }

}
