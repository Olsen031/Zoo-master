public class RingTailedLemur extends Primate {
    private String age;
    public RingTailedLemur(){
        super("Ring Tailed Lemur", "small primates with big tails");
        this.age = "middle aged Lemur";
    }

    @Override
    public String makeNoise()
    {
        // put your code here
        return "make soft screeching noises";
    }
}
