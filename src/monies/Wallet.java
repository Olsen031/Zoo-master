package monies;

public class Wallet {

    private int wallet;
    private int totalWallet = 100;
    private int cost;
    private int totalCost;


    public Wallet(int wallet){
        this.wallet = wallet;
        totalWallet = wallet + totalWallet;
    }
    public void setWallet(int w){
        this.wallet = w;
    }
    public int getTotalWallet(){
        return totalWallet;
    }
    public void setCost(int c){
        this.cost = c;
        totalWallet = totalCost - cost;
    }
    public int getTotalCost(){ return totalCost;}
}
