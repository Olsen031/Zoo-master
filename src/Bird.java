public class Bird extends Animal implements Flying {

    public Bird(){
        super("bird", "many different colorful birds");
    }
    public Bird(String name, String desc){super(name, desc);}
    public String makeNoise(){return "squacks";}
    public String eat(){return "worms and bird seed";}
    public String fly(){return "flys high in the sky gracefully";}


}
