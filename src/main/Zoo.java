 
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;

//import animal_qualities.Galloping;
//import animal_qualities.Swimming;
//import animal_qualities.Flying;
//import animal_qualities.Walking;
import animal_qualities.*;
import animals.Alligator;
import animals.Chimpanzee;
import animals.Orangutan;
import animals.Parrot;
import animals.RingTailedLemur;
import animals.Zebra;
import monies.Concessions;
import monies.Gift_Shop;
import monies.Wallet;
/**
 * Test
 * 
 * @author APCSA2014-15 
 * @version 2015-03-06
 */
public class Zoo
{
    public static  void main(String[] args) throws InterruptedException 
    {
        List<Animal> animals = new ArrayList<Animal>();

        System.out.println("Welcome to the Zoo!\n");
        System.out.print("Building the cages");
        delayDots();
        System.out.print("Populating the animals");
        populateAnimals(animals);
        delayDots();
        System.out.print("Hiring zookeepers");
        delayDots();

        Scanner in = new Scanner(System.in);
        System.out.println("\nYou are standing in a wondrous zoo. What would you like to do?");
        System.out.println("Type help to find out what you can do.\n");
        String text = in.nextLine();
        String msg = "";
        while(!text.equals("leave"))
        {
            switch(text)
            {
                case "help" : 
                msg = "So far we can visit cages, listen, leave \n"+
                "and ask for help.";
                break;
                case "visit cages" : 
                msg = visitCages(animals);
                break;
                case "look up" :
                msg = lookUp(animals);
                break;
                case "look around" :
                msg = lookAround(animals);
                break;
                case "listen" :
                msg = listen(animals);
                break;
                case "look down":
                msg = lookDown(animals);
                break;
                case "look behind":
                    msg = lookBehind(animals);
                    break;
                case "concessions":
                    monies.Concessions.getOrder();
                    break;
                case "gift shop":
                    monies.Gift_Shop.getPurchase();
                    break;


                default : msg = "You flail helplessly with indecision.";
            }
            System.out.println("\n" + msg);
            delayDots(3);
            System.out.println("\nYou are standing in a wondrous zoo. What would you like to do?\n");
            text = in.nextLine();
        }

        System.out.println(Math.random() < .8 ? "\nHave a nice day!  Hope you come back!" : "\nAn escaped lion eats you on your way out.  Sorry!");

    }


    public static String visitCages(List<Animal> animals)
    {
        String msg = "";
        for(Animal a : animals)
        {
            msg += a.getName() + ": \n       " + a.getDesc() + "\n";
        }
        return msg;
    }

    public static String listen(List<Animal> animals)
    {
        String msg = "";
        for(Animal a : animals)
        {
            msg += a.getName() + ": \n       " 
            + a.makeNoise() + "\n";
        }
        return msg;
    }

    public static String lookDown(List<Animal> animals)
    {
        String msg = "";

        for(Animal a : animals)
        {
            if(a instanceof Swimming)
            {
                Swimming f = (Swimming) a;
                msg += a.getName() + ": \n       "
                + f.swim() + "\n";
            }
        }
        return msg;

    }

    public static String lookAround(List<Animal> animals)
    {
        String msg = "";

        for(Animal a : animals)
        {
            if(a instanceof Walking) 
            {
                Walking w = (Walking) a;
                msg += a.getName() + ": \n       " 
                + w.walk() + "\n";
            }
        }
        return msg;

    }

    public static String lookBehind(List<Animal> animals){
        String msg ="";
        for(Animal a: animals)
        {
            if(a instanceof Galloping){
                Galloping g = (Galloping) a;
                msg += a.getName() + ": \n          "
                        + g.gallop() + "\n";
            }
        }
        return msg;
    }

    public static String lookUp(List<Animal> animals)
    {
        String msg = "";

        for(Animal a : animals)
        {
            if(a instanceof Flying)
            {
                Flying f = (Flying) a;
                msg += a.getName() + ": \n       "
                + f.fly() + "\n";
            }
        }
        return msg;

    }




    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    public static void delayDots(int dotAmount) throws InterruptedException 
    {
        for (int i=0; i<dotAmount; i++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }
        System.out.println();
    }

    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    public static void delayDots() throws InterruptedException 
    {
        delayDots(0);
    }

    /**
     * This is where we will all collaborate.
     * Construct your animal and add it to the List
     * @param animals the list containing all the zoo animals
     */
    public static void populateAnimals(List<Animal> animals)
    {

//        Primate hairy = new Primate();
//        animals.add(hairy);
        Chimpanzee george = new Chimpanzee();
        animals.add(george);
//        Primate orange = new Primate();
//        animals.add(orange);
        Orangutan peter = new Orangutan();
        animals.add(peter);
//        Primate ring = new Primate();
//        animals.add(ring);
        RingTailedLemur arnold = new RingTailedLemur();
        animals.add(arnold);
//        Reptile scaly = new Reptile();
//        animals.add(scaly);
        Alligator callie = new Alligator();
        animals.add(callie);
//        Bird feather = new Bird();
//        animals.add(feather);
        Parrot polly = new Parrot();
        animals.add(polly);
//        Equine black = new Equine();
//        animals.add(black);
        Zebra Stripes = new Zebra();
        animals.add(Stripes);




    }
}