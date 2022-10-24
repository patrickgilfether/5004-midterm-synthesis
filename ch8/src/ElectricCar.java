/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.8 practical
 CS 5004
 10/13/2022
 *******************************************************************************/
public class ElectricCar extends MotorVehicle{
    public ElectricCar(String make, String model, int year, String color, double milesPerKWH, double batterySize) {
        super(make, model, year, color, milesPerKWH);
        this.fuelSource = new Battery(batterySize);
    }

    @Override
    public void driveNoise(){
        System.out.println("*WOOOOOOOOOOOOOOOOOOOSHHHH*");
    }

    @Override
    public void honk() {
        System.out.println("*BEEP-BOOP-BEEP*");
    }
}
