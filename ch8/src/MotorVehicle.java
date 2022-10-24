/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.8 practical
 CS 5004
 10/13/2022
 *******************************************************************************/

public abstract class MotorVehicle extends Vehicle{
    protected double milesPerUnit;
    protected FuelSource fuelSource;
    protected double odometer;

    public MotorVehicle(String make, String model, int year, String color, double milesPerUnit) {
        super(make,model,year,color);
        if(milesPerUnit<=0) throw new IllegalArgumentException("milesPerUnit must be >0 due to entropy, man.");
        setOdometer(0);
        this.milesPerUnit = milesPerUnit;
    }


    /**
     * drive extends the abstract method of vehicle
     * @param distance is distance to be travelled
     */
    public void drive(double distance){
        double fuelCost = TransportationMath.fuelCost(distance,milesPerUnit);
        fuelSource.use(fuelCost);
        setOdometer(distance);
        System.out.println( make + " " + model + " drove " + String.format("%.2f",distance) + " miles and consumed " + String.format("%.2f",fuelCost) + fuelSource.unitType);
    }

    //Begin Getters

    public FuelSource getFuelSource() {
        return fuelSource;
    }

    public double getMilesPerUnit() {
        return milesPerUnit;
    }

    public double getOdometer() {
        return odometer;
    }

    //End Getters


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


    @Override
    public String toString() {
        return "MotorVehicle{" + make + " " + model + ", odometer=" + odometer +
                ", fuelSource=" + fuelSource +
                '}';
    }
}