package monies;

import java.util.Scanner;

public class Gift_Shop {
    private String item;
    private int cost;


    public Gift_Shop(String i, int c){
        this.item = i;
        this.cost = c;
    }




    public static int getPurchase() {
        String itemOrder;
        int order;
        Gift_Shop item1 = new Gift_Shop("Snow Globes", 8);
        Gift_Shop item2 = new Gift_Shop("Oversized Lollypops", 5);
        Gift_Shop item3 = new Gift_Shop("Panda Shot Glass", 15);
        Gift_Shop item4 = new Gift_Shop("Safari Hat", 12);
        Gift_Shop item5 = new Gift_Shop("Stuffed Animals", 6);
        Gift_Shop item6 = new Gift_Shop("Real Life Zebra", 25);
        Gift_Shop item7 = new Gift_Shop("Real Life Ring Tailed Lemur", 50);
        Gift_Shop item8 = new Gift_Shop("Huge Pixie Sticks", 5);
        Gift_Shop item9 = new Gift_Shop("Zoo Pencils", 2);
        Gift_Shop item10 = new Gift_Shop("Real Life Person", 500);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Food items: Snow Globes $8, Oversized Lollypops $5, Panda Shot Glass $15, Safari Hat $12, Stuffed Animals $6, Real Life Zebra $25, Real Life Ring Tailed Lemur $50, \n " +
                "Huge Pixie Sticks $5,  Zoo Pencils $2");
        System.out.println("Enter the item you wish to purchase:");
        itemOrder = keyboard.nextLine();
        Wallet wallet1 = new Wallet(100);

        switch (itemOrder) {
            case "Snow Globes":
                order = item1.cost;
                System.out.println("You ordered " + item1.item);
                break;
            case "Oversized Lollypops":
                order = item2.cost;
                System.out.println("You ordered " + item2.item);
                break;
            case "Panda Shot Glass":
                order = item3.cost;
                System.out.println("You ordered " + item3.item);
                break;
            case "Safari Hat":
                order = item4.cost;
                System.out.println("You ordered " + item4.item);
                break;
            case "Stuffed Animal":
                order = item5.cost;
                System.out.println("You ordered " + item5.item);
                break;
            case "Real Life Zebra":
                order = item6.cost;
                System.out.println("You ordered " + item6.item);
                break;
            case "Real Life Ring Tailed Lemur":
                order = item7.cost;
                System.out.println("You ordered " + item7.item);
                break;
            case "Huge Pixie Sticks":
                order = item8.cost;
                System.out.println("You ordered " + item8.item);
                break;
            case "Zoo Pencils":
                order = item9.cost;
                System.out.println("You ordered " + item9.item);
                break;
            default:
                order = item10.cost;
                System.out.println("You ordered " + item10.item);
                break;
        }

        wallet1.setCost(order);
        System.out.println(wallet1.getTotalWallet());

        return wallet1.getTotalWallet();
    }
}
