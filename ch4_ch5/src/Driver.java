/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.4 practical
 CS 5004
 10/13/2022
 *******************************************************************************/
public class Driver {
    public static void main(String[] args) {

        //this is the driver class for the car class *ha ha ha*
        int myKey = 4394;

        //make some cars
        System.out.println("\nMaking Cars:");
        Car c1 = new Car("Toyota", "Landcruiser", 1992, "gold", myKey, 13.5);
        System.out.println("made a " + c1 + ". Now there is " + c1.getNumCars() + " car in existence");
        Car c2 = new Car("Toyota", "Prius", 2018, "silver", myKey, 50.00);
        System.out.println("made a " + c2 + ". Now there are " + c1.getNumCars() + " car(s) in existence");
        System.out.println("notice that c1's num cars is: " + c1.getNumCars() + " which is equal to c2's num cars:  " + c1.getNumCars() + ". \nThis is because numCars is static");
        // make some distances
        double d1 = 50;
        double d2 = 138;

        System.out.println("\nPrinting ranges:");
        //demo of range
        c1.printRange();
        c2.printRange();


        //demo of driving distance 1
        System.out.println("\nTaking drive 1 of 50 miles:");
        c1.drive(myKey,d1);
        c2.drive(myKey,d1);

        //demo of range after drive
        System.out.println("\nPrinting ranges after first drive:");
        c1.printRange();
        c2.printRange();

        //demo of driving distance 2
        System.out.println("\nTaking drive 2 of 138 miles:");
        c1.drive(myKey,d2);
        c2.drive(myKey,d2);

        //demo of range after drive
        System.out.println("\nPrinting ranges after second drive:");
        c1.printRange();
        c2.printRange();

    }
}
