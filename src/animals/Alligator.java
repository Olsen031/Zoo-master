
package animals;

import types.Reptile;

/**
 * Write a description of class Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator extends Reptile
{
    // instance variables - replace the example below with your own
    private int x;
    private String age;

    /**
     * Constructor for objects of class Alligator
     */
    public Alligator()
    {
        super("Alligator", "scaly reptiles that are predators");
        this.age = "a 50 year old alligator";
    }



    @Override
    public String makeNoise()
    {
        // put your code here
        return "growl and scowl";
    }
    
    
}
