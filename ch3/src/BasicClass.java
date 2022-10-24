/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.3 practical
 CS 5004
 10/13/2022
 *******************************************************************************/
public class BasicClass {
    public static void main(String[] args) {

        //this is the driver class for the car class *ha ha ha*
        int myKey = 4394;
        int wrongKey = 8569;
        int stolenKey;
        Car myCar = new Car("Toyota", "Landcruiser", 1992, "gold", myKey);
        int res;

        //demo of attempt to drive car with correct key
        res = myCar.drive(myKey);
        printRes(res);

        //demo of attempt to drive car with incorrect key
        res = myCar.drive(wrongKey);
        printRes(res);
        /*
        demo of attempt to read private data member key of car
        uncomment next line of code to see access error at compile time.
        this occurs because key is a private member of a car object and thus cannot be accessed by the public
         */
//        stolenKey = myCar.key;

        /*
        demo of attempt to set private data member key of car
        uncomment next line of code to see access error at compile time.
        this occurs because key is a private member of a car object and thus cannot be accessed by the public
         */
//        myCar.key = wrongKey;

    }

    public static void printRes ( int res){
            if (res >=1) {
                System.out.println("The key worked! The car was driven!");
            } else {
                System.out.println("Wrong key! The car was not driveable with that key!");
            }
        }


}

class Car{
    /*
   class defining a car
   attributes:
       +make: final String
       +model: final String
       +year: final int
       +color: String
       -key: final String
   methods:
       +constructor(make,model,year,color,key)
       +getMake():String
       +getModel():String
       +getYear():int
       +GetColor():String
       +drive( key:int):int
     */

    /*declare public variables:
    make,model,year,color are discernible to anybody that interacts with a car, so they are public
    make,model,year cannot (legally) be changed, and are thus final.
    color can be legally changed, and is thus not final
     */
    public final String make;
    public final String model;
    public final int year;
    public String color;

    /*key must be private so that the car can only be used by those who have the key
    and have gotten it from some means other than the car itself.
    I've not made it final as a car could be re-keyed
     */
    private int key;

    /**
     * full arg constructor
     * @param make
     * @param model
     * @param year
     * @param color
     * @param key this lets a user confirm ownership in order to drive the car.
     */
    public Car(String make, String model, int year, String color, int key) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.key = key;

    }

    //Begin Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
    //End Getters

    /**
     *
     * @param key to unlock car
     * @return 1 if success, -1 if wrong key
     */
    public int drive(int key){
        //confirm key is correct
        if(key != this.key) {
            return -1; //if wrong key, signal an error by returning -1
        } else return 1; //if key is correct, signal success by returning 1.
    }

}



