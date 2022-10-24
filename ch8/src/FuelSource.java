/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.8 practical
 CS 5004
 10/13/2022
 *******************************************************************************/
public class FuelSource {
    final double capacity;
    double current;
    FuelType type;
    String unitType;

    public FuelSource(double size) {
        capacity = size;
        current = size;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrent() {
        return current;
    }

    private void setCurrent(double current) {
        if (current<0) throw new IllegalArgumentException("Current amount of fuel in a fuel source cannot be negative");
        if (current>capacity) throw new IllegalArgumentException("Current amount of fuel in a fuel source cannot exceed capacity");
        this.current = current;
    }

    public void use(double fuelCost){
        if (current >= fuelCost){
            setCurrent(current-fuelCost);
        } else throw new IllegalStateException("Fuel source contains insufficient fuel for that operation");
    }

    public void refuel(FuelSource giver){
        try {
            giver.use(this.capacity - this.current);
            this.setCurrent(this.capacity);
        } catch (Exception e){
//            System.out.println("Giving fuel source contained insufficient fuel to completely refuel");
            this.setCurrent(giver.getCurrent());
            giver.setCurrent(0);
        }
    }

    @Override
    public String toString() {
        return "FuelSource{" +
                "capacity=" + String.format("%.2f",capacity) +
                ", current=" + String.format("%.2f",current) +
                ", type=" + type +
                ", unitType='" + unitType + '\'' +
                '}';
    }
}
