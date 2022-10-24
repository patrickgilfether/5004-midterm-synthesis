/******************************************************************************
 Patrick Gilfether
 Midterm Synthesis, ch.1 practical
 CS 5004
 10/13/2022
 *******************************************************************************/
public class Comments{
    //COMMENT TYPE 1: Single line:
    //This is a single line comment. It won't print

    /*
     *COMMENT TYPE 2: multiline
     * This is a block comment. 
     * It won't print either.
     * These make nice headers, are useful for extended descriptions, etc
     */

    /**
     * COMMENT TYPE 3: JavaDoc
     * This is a JavaDoc comment. My IDE is pretty smart
     * and automatically formatted this comment for the main function below. 
     * This also will not print, however, we can use IDEs or the commandline 'javadoc filename.extension' 
     * to generate Javadocs
     * from these comments very easily. The @tagged inputs get formatted specially
     * and the whole file gets packaged up in html, making it easy to share online 
     * or just view and interact with in a web browser.
     * @param args description goes here
     */

    public static void main(String[] args){
        System.out.println("This is the only thing that will print");
    }
}