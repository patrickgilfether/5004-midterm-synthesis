/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.8 practical
 CS 5004
 10/13/2022
 *******************************************************************************/

//This class exists solely to demonstrate a non-vehicle implementation of Noise interface
public class Bird implements Noise{
    @Override
    public void driveNoise(){
        System.out.println("*flap flap flap flap flap flap*");
    }

    @Override
    public void honk() {
        System.out.println("*tweedeee-dee... tweeedeee-dee...*");
    }
}
