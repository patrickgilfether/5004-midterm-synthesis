/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.4 practical
 CS 5004
 10/15/2022
 *******************************************************************************/
/**
*class built explicitly for doing mathematical operations for transportation simulation
* methods are static and unit-agnostic, allowing for abstract usage with gas and electric vehicles
* or usage with metric and english units of measure
*/
public class TransportationMath {

    /**
     * fuelCost() returns an abstract # of fuel units consumed to travel a given distance at a given efficiency
     * distance should be of same unit as used in distancePerUnit
     * @param distance distance traveled by vehicle (e.g. miles).
     * @param distancePerUnit distance traveled by vehicle for each unit of fuel consumed (e.g. miles per gallon)
     * @return
     */
    public static double fuelCost(double distance, double distancePerUnit){
        return (distance/distancePerUnit);
    }

    /**
     * range() returns an abstract distance(e.g.miles) that can be travelled given a quantity of fuel and efficiency
     * fuelUnits should be of same unit as used in distancePerUnit
     * @param fuelUnits an abstract quantity of fuel. should be in same unit as distance per unity
     * @param distancePerUnit distance traveled by vehicle for each unit of fuel consumed (e.g. miles per gallon)
     * @return
     */
    public static double range(double fuelUnits, double distancePerUnit){
        return (fuelUnits * distancePerUnit);
    }


}
