package types;

import main.Animal;
import animal_qualities.Galloping;

public class Equine extends Animal implements Galloping {

    public Equine(){
        super("equine", "a horse like descendant");
    }

    public Equine(String name, String desc){super(name, desc);}
    public String makeNoise(){return "neeeeaah";}
    public String eat(){return "grass";}
    public String gallop(){return "runs very fast using 4 legs";}


}
