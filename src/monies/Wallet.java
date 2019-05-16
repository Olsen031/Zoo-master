package monies;

public class Wallet {

    private int wallet = 1000;
    private int totalWallet = 0;
    private int cost;
    private int totalCost = 0;


    public Wallet() {
        this.wallet = wallet;
        totalWallet = wallet + totalWallet;
    }
//    public void setWallet(int w){
//        this.wallet = w;
//        totalWallet = totalWallet + wallet;
//    }
//    public int getTotalWallet(){
//        totalWallet = wallet + getTotalCost();
//        return totalWallet;
//    }
//    public void setCost(int c){
//        this.cost = c;
//        totalCost = totalCost - cost;
//    }
//    public int getTotalCost(){ return totalCost;}
//}
        public void setWallet(int w){
        this.wallet = w;
        }
        public int getWallet(){
        totalWallet = wallet;
        }


}
