
/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.5 practical
 CS 5004
 10/15/2022
 *******************************************************************************/

public class TransportationMathTester {

    public static void main(String[] args) {
        double expected;
        double actual;
        double error = 0.000001;
        boolean passed;

        System.out.println("This driver is an alternative to a junit test. We'll use it to test TransportationMath");

        System.out.println("Testing range with 10 gallons tank and 10 mpg");
        expected = 100.00;
        actual = TransportationMath.range(10,10);
        passed = (Math.abs(expected-actual)<error);//check that difference between expected and actual is inside of acceptable error

        System.out.println("expected: " + expected);
        System.out.println("actual: " + actual);
        System.out.println("passed: " + passed);


        System.out.println("\nTesting fuelCost with 100 miles and 10 mpg");
        expected = 10.00;
        actual = TransportationMath.fuelCost(100,10);
        passed = (Math.abs(expected-actual)<error);//check that difference between expected and actual is inside of acceptable error

        System.out.println("expected: " + expected);
        System.out.println("actual: " + actual);
        System.out.println("passed: " + passed);
    }
}
