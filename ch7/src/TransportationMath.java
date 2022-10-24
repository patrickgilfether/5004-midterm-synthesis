/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.7 practical
 CS 5004
 10/13/2022
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
     * @throws IllegalArgumentException if distance or DPU negative
     * @param distance distance traveled by vehicle (e.g. miles).
     * @param distancePerUnit distance traveled by vehicle for each unit of fuel consumed (e.g. miles per gallon)
     * @return abstract # of fuel units consumed to travel a given distance at a given efficiency
     */
    public static double fuelCost(double distance, double distancePerUnit){
        //adding exception handling to deal with negative fuel cost scenarios
        if (distance < 0){
            throw new IllegalArgumentException("distance cannot be negative!");
        }
        if (distancePerUnit < 0){
            throw new IllegalArgumentException("distance per unit cannot be negative!");
        }
        return (distance/distancePerUnit);
    }

    /**
     * range() returns an abstract distance(e.g.miles) that can be travelled given a quantity of fuel and efficiency
     * fuelUnits should be of same unit as used in distancePerUnit
     * @throws IllegalArgumentException if fuelUnits or DPU negative
     * @param fuelUnits an abstract quantity of fuel. should be in same unit as distance per unity
     * @param distancePerUnit distance traveled by vehicle for each unit of fuel consumed (e.g. miles per gallon)
     * @return abstract distance(e.g.miles) that can be travelled given a quantity of fuel and efficiency
     */
    public static double range(double fuelUnits, double distancePerUnit){
        //adding exception handling to deal with negative fuel cost scenarios
        if (fuelUnits < 0){
            throw new IllegalArgumentException("fuelUnits cannot be negative!");
        }
        if (distancePerUnit < 0){
            throw new IllegalArgumentException("distance per unit cannot be negative!");
        }
        return (fuelUnits * distancePerUnit);
    }


}
