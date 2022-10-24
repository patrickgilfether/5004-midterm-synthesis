/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.8 practical
 CS 5004
 10/13/2022
 *******************************************************************************/
public class GasTank extends FuelSource {
    public GasTank(double gallons) {
        super(gallons);
        type = FuelType.GASOLINE;
        unitType = "gallons";
    }

    @Override
    public String toString() {
        return "GasTank{" +
                "capacity=" + String.format("%.2f",capacity) +
                ", current=" + String.format("%.2f",current) +
                ", type=" + type +
                ", unitType='" + unitType + '\'' +
                '}';
    }
}