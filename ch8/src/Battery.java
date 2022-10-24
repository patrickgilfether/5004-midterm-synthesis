/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.8 practical
 CS 5004
 10/13/2022
 *******************************************************************************/
public class Battery extends FuelSource{
    public Battery(double kwh) {
        super(kwh);
        type = FuelType.ELECTRIC;
        unitType = "kilowatt hours";
    }

    @Override
    public String toString() {
        return "Battery{" +
                "capacity=" + String.format("%.2f",capacity) +
                ", current=" + String.format("%.2f",current) +
                ", type=" + type +
                ", unitType='" + unitType + '\'' +
                '}';
    }
}
