 


/**
 * Write a description of class Orangutan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orangutan extends Primate
{
    // instance variables - replace the example below with your own
    private int x;
    private String age;

    /**
     * Constructor for objects of class Orangutan
     */
    public Orangutan()
    {
        super("Oranguan", "orange and brown, violent");
        this.age = "older than dirt";
    }

    @Override
    public String makeNoise()
    {
        // put your code here
        return "ooooo-oooooo aaaaah-aaaaah";
    }
    
}
