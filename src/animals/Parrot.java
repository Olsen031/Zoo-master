package animals;

import types.Bird;


/**
 * Write a description of class Parrot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parrot extends Bird
{
    // instance variables - replace the example below with your own
    private int x;
    private String age;

    /**
     * Constructor for objects of class Parrot
     */
    public Parrot()
    {
        super("Parrot", "vary in color, typically red");
    }



    @Override
    public String makeNoise(){
        return "squack squack";
    }
    
}
