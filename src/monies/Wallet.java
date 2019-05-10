package monies;

public class Wallet {

    private int wallet;
    private int totalWallet;
    private int cost;


    public Money(int wallet){
        this.wallet = wallet;
        totalWallet = wallet + totalWallet;
    }

    public void setWallet(int w){

    }
    public int getTotalWallet(){
        return totalWallet;
    }
    public void setCost(int c){

    }
}
