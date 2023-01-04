/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Wei Han
 */
public class Q6 {

    public static void main(String[] args) {
        BurgerStall stall1 = new BurgerStall("First Stall", 5);
        BurgerStall stall2 = new BurgerStall("Second Stall", 10);
        BurgerStall stall3 = new BurgerStall("Third Stall", 20);

        System.out.println(stall1.getID() + " Burger Sold: " + stall1.getTotalBurgerSoldStall());
        System.out.println(stall2.getID() + " Burger Sold: " + stall2.getTotalBurgerSoldStall());
        System.out.println(stall3.getID() + " Burger Sold: " + stall3.getTotalBurgerSoldStall());
        System.out.println("Total Burger Sold: " + BurgerStall.getTotalBurgerSoldAllStalls());

        BurgerStall stall4 = new BurgerStall("Fourth Stall", 40);
        stall4.sold(20);
        System.out.println(stall4.getID() + " Burger Sold: " + stall4.getTotalBurgerSoldStall());
        System.out.println("Total Burger Sold: " + BurgerStall.getTotalBurgerSoldAllStalls());
    }
}

class BurgerStall {

    //Initialize ID, burgerSold and totalBurgerSold class variables
    private String ID;
    private int totalBurgerSoldStall;
    private static int totalBurgerSoldAllStalls;

    //Constructor for initializing burger stall class variables with ID and burger sold
    public BurgerStall(String ID, int burgerSold) {
        this.ID = ID;
        this.totalBurgerSoldStall = burgerSold;
        totalBurgerSoldAllStalls += burgerSold;
    }

    //Getters
    public String getID() {
        return ID;
    }

    public int getTotalBurgerSoldStall() {
        return totalBurgerSoldStall;
    }

    public static int getTotalBurgerSoldAllStalls() {
        return totalBurgerSoldAllStalls;
    }

    //Sold method for incrementing the total burger sold of stall
    //and all stall by the amount in the parameter
    public void sold(int amount) {
        totalBurgerSoldStall += amount;
        totalBurgerSoldAllStalls += amount;
    }
}
