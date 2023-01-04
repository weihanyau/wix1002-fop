/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.Random;

/**
 *
 * @author Wei Han
 */
public class Q5 {

    public static void main(String[] args) {
        Game player1 = new Game("Player 1");
        Game player2 = new Game("Player 2");

        while (true) {
            if (moveAndCheckWinConditions(player1)) {
                break;
            }
            if (moveAndCheckWinConditions(player2)) {
                break;
            }
        }
    }

    public static boolean moveAndCheckWinConditions(Game player) {
        player.move();
        System.out.println(player.getName() + " Dice: " + player.getDice());
        System.out.println(player.getName() + " Total: " + player.getTotal());
        if (player.getTotal() >= 100) {
            System.out.println(player.getName() + " wins!");
            return true;
        }
        System.out.println();
        return false;
    }
}

class Game {

    private String name;
    private int dice;
    private int total;

    // Constructor for initializing name, dice and total
    public Game(String name) {
        this.name = name;
        dice = 0;
        total = 0;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getDice() {
        return dice;
    }

    public int getTotal() {
        return total;
    }

    //Roll the dice to move
    //Add the dice values to total
    public void move() {
        Random random = new Random();
        dice = random.nextInt(6) + 1;
        total += dice;
    }
}
