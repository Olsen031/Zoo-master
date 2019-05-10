 
package animals;

import types.Equine;

/**
 * Write a description of class Ring_Tailed_Lemurs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zebra extends Equine
{
    // instance variables - replace the example below with your own
    private int x;
    private String age;

    /**
     * Constructor for objects of class Zebra
     */
    public Zebra()
    {
        super("Zebra", "black with white strips or white with black stripes");
        this.age = ("extremely young");
    }

    @Override
    public String makeNoise()
    {
        // put your code here
        return "neeeeeeeeh";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * 
     */

    
    
}
