package monies;

import java.util.Scanner;

public class Concessions {

    private String item;
    private int cost;


    public Concessions(String i, int c){
       this.item = i;
       this.cost = c;
    }




    public static int getOrder() {
        String itemOrder;
        int order;
        Concessions item1 = new Concessions("Funnel Cake", 10);
        Concessions item2 = new Concessions("Kettle Corn", 5);
        Concessions item3 = new Concessions("Popcorn", 7);
        Concessions item4 = new Concessions("Hamburger", 4);
        Concessions item5 = new Concessions("Bottle of Water", 2);
        Concessions item6 = new Concessions("Mystery meat", 0);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Food items: Funnel Cake $10, Kettle Corn $5, Popcorn $7, Hamburger $4, Bottle of Water $2");
        System.out.println("Enter the food item you wish to purchase:");
        itemOrder = keyboard.nextLine();
        Wallet wallet1 = new Wallet(100);

        switch (itemOrder) {
            case "Funnel Cake":
                order = item1.cost;
                System.out.println("You ordered " + item1.item);
                break;
            case "Kettle Corn":
                order = item2.cost;
                System.out.println("You ordered " + item2.item);
                break;
            case "Popcorn":
                order = item3.cost;
                System.out.println("You ordered " + item3.item);
                break;
            case "Hamburger":
                order = item4.cost;
                System.out.println("You ordered " + item4.item);
                break;
            case "Bottle of Water":
                order = item5.cost;
                System.out.println("You ordered " + item5.item);
                break;
            default:
                order = item6.cost;
                System.out.println("You ordered " + item6.item);
                break;
        }

        wallet1.setCost(order);
        return wallet1.getTotalWallet();
    }

}
