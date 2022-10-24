/******************************************************************************
Patrick Gilfether
Midterm Synthesis, ch.2 practical
CS 5004
10/13/2022
*******************************************************************************/
public class TypeCasting {
    //declaring data types from smallest to largest
    // boolean b; //1 bit
    
	public static void main(String[] args) {
    	int i; // 4 bytes (32bit)
//		int i2;
        float f;//4 bytes (32 bit), but supports floating point arithmetic (decimal place / mantissa)
//		float f2;
        double d;//8 byes (64 bit), supports floating point arithmetic
//		double d2;
		
		/*we'll start with a small number and see what happens 
		    when we implicitly cast it to larger types
		    this is called a widening cast, which java handles via 
		    automatic type promotion
		*/
		System.out.println("\nwidening casts:");

		i = 42;
		System.out.println("i is of type int and holds " + i);
		
		f = i;//implicitly cast int i to float f. Compiler will 'upgrade' the type
		System.out.println("f is of type float and holds " + f);
		
		d = f;//implicitly cast float f to double d. Compiler will upgrade again. 
		System.out.println("d is of type double and holds " + d);


		System.out.println("\nnarrowing casts:");

		System.out.println("Max example:");
        //now we'll see what happens when we start narrowing
        //lets make d a very large number and try to put it in smaller boxes implicitly and explicitly
        d = Double.MAX_VALUE;
//		System.out.println("d is of type double and holds " + d);
		System.out.printf("d is of type double and holds %f\n", d);
		
		/*
		the next few lines are commented out because they throw a compilation error.
		uncomment to see that java compiler cannot implicitly cast a lossy narrowing conversion
		*/
    //     f = d;//implicitly cast double d to float f. Compiler will error
    // 	System.out.println("d is of type double and holds " + d);
    
        /* lets use an explicit cast and see how much data we lose
        */

        f = (float)d;//implicitly cast float f to double d. Compiler will upgrade again.
		System.out.println("After cast and assignment, f is of type float and holds " + f);
		System.out.println("Notice that the compiler rounds up to infinity here!\n");

		/* what if d is a very small number, what do we lose in the explicit cast?
		 */
		System.out.println("Min example:");
		d = Double.MIN_VALUE;

		System.out.printf("d is of type double and holds a very small number... %e\n", d);
		f = (float)d;//explicitly cast double d to float. Compiler will have to throw away data
		System.out.println("After cast and assignment, f is of type float and holds: " + f);
		System.out.println("Notice that the compiler rounds up to zero here!");

		System.out.println("\nLet's try some arithmetic:");
		//multiply a double by an int
		d = Double.MAX_VALUE;
		i = 4;
		System.out.printf("d is of type double and holds %f\n", d);
		System.out.printf("i is of type int and holds %d\n", i);
		d*=i;//implicitly cast i to double. Compiler will have to throw away data due to overflow
		System.out.println("After multiplication of d *i, d is of type double and holds " + d);
		System.out.println("Notice that the compiler rounds up to infinity in this overflow situation\n");


		System.out.println("\nThis works fine with number smaller than double.max though!");
		//multiply a double by an int
		d = 50656700000.584848;
//		i = 4;
		System.out.printf("d is of type double and holds %f\n", d);
		System.out.printf("i is of type int and holds %d\n", i);
		d= d*i;//implicitly cast i to double. Compiler will have to throw away data due to overflow
		System.out.printf("After multiplication of d *i, d is of type double and holds %f\n", d);
		d = 50656700000.584848;
		System.out.printf("We can even do this without assignment in a print statement %f\n", d*i);
		System.out.println("Notice that the compiler rounds up to infinity in this overflow situation\n");

		System.out.println("\nCheck out what happens with ints!");
		i = 12/7;
		System.out.printf("if we assign int i = 12/7, the compiler will automatically lop off the decimal portion using integer division, yielding:  %d\n", i);

		System.out.println("\nand what about dividing an int by a double?");
		d= 45.99;
		i=3;
		System.out.printf("d is of type double and holds %f\n", d);
		System.out.printf("i is of type int and holds %d\n", i);
		i=(int)(d/i); // if we don't use an explicit cast, the program will not compile due to possible lossy conversion
		System.out.printf("if we assign int i=d/i, with an explicit cast, again compiler will automatically lop off the decimal portion using integer division, yielding: %d\n", i);


	}


}
