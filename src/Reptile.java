public class Reptile extends Animal implements Swimming {

    public Reptile(){
        super("reptile", "scaly animals that are cold blooded");
    }
    public Reptile(String name, String desc){super(name, desc);}
    public String makeNoise(){return "hisses and growls";}
    public String eat(){return "other animals";}
    public String swim(){return "they can swim";}

}
