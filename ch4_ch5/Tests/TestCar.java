import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCar{
    /*
    declare valuables in the scope of the class definition so all methods have access
     */
    int myKey;
    int wrongKey;
    Car c1;
    Car c2;
    double d1;
    double d2;


    /*
    the setup method will be run before each test because the @Before tag. It ensures that we reset variables.
     */
    @Before//tells junit to run this method before each test
    public void setup(){

        //make some keys
        myKey = 4394;
        wrongKey = 1234;
        //make some cars
        c1 = new Car("Toyota", "Land Cruiser", 1992, "gold", myKey, 13.5);
        c2 = new Car("Toyota", "Prius", 2018, "silver", myKey, 50.00);
        // make some distances
        d1 = 50;
        d2 = 138;

    }

    @Test//tells junit this is a test
    //test drive right key
    public void testRightKey(){
        //the assert equals method checks if the first argument (expected value) is equivalent to the second (actual)
        assertEquals(1,c1.drive(myKey,d1)); //notice that i just call the method directly to generate the actual
    }


    @Test
    //test drive wrong key
    public void testWrongKey(){
        assertEquals(-1,c1.drive(wrongKey,d1));
    }

    @Test
    //test fuel consumption
    public void testFuelConsumption(){
        double expectedFuelCost = d1/c1.getMilesPerGallon();
        double expectedGasTank = c1.getGastank()-expectedFuelCost;
        c1.drive(myKey,d1);
        assertEquals(expectedGasTank,c1.getGastank(),0.000001); //testing doubles requires specifying a margin of error, the third argument in this invocation

        expectedFuelCost = d2/c2.getMilesPerGallon();
        expectedGasTank = c2.getGastank()-expectedFuelCost;
        c2.drive(myKey,d2);
        assertEquals(expectedGasTank,c2.getGastank(),0.000001);
    }

    @Test
    //test constructor and getters
    public void testConstructor(){
        assertEquals("Toyota", c1.getMake());
        assertEquals("Land Cruiser", c1.getModel());
        assertEquals(1992, c1.getYear());
        assertEquals(13.5,c1.getMilesPerGallon(),.000001);
        assertEquals("gold",c1.getColor());
        assertEquals(30,c1.getGastank(),.000001);

    }
}
