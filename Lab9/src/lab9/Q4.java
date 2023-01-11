/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

import java.util.Random;

/**
 *
 * @author Wei Han
 */
public class Q4 {

    public static void main(String[] args) {
        GameOne g1 = new GameOne();
        GameTwo g2 = new GameTwo();

        System.out.println("Game 1");
        g1.startGame();

        System.out.println("Game 2");
        g2.startGame();
    }
}

class DiceGame {

    private int player1;
    private int player2;

    public DiceGame() {
        player1 = 0;
        player2 = 0;
    }

    public void addPlayer1Score(int n) {
        player1 += n;
    }

    public void addPlayer2Score(int n) {
        player2 += n;
    }

    public int getPlayer1Score() {
        return player1;
    }

    public int getPlayer2Score() {
        return player2;
    }

    public boolean checkPlayer1Win() {
        return player1 >= 100;
    }

    public boolean checkPlayer2Win() {
        return player2 >= 100;
    }

    public int rollDice() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }
}

class GameOne extends DiceGame {

    public void startGame() {
        while (true) {
            int p1roll = rollDice();
            System.out.println("Player 1 rolled: " + p1roll);
            addPlayer1Score(p1roll);
            while (p1roll == 6) {
                p1roll = rollDice();
                System.out.println("Player 1 rolled: " + p1roll);
                addPlayer1Score(p1roll);
            }
            System.out.println("Player 1 scores: " + getPlayer1Score());
            if (checkPlayer1Win()) {
                System.out.println("Player 1 wins");
                break;
            }
            System.out.println("");

            int p2roll = rollDice();
            System.out.println("Player 2 rolled: " + p2roll);
            addPlayer2Score(p2roll);
            while (p2roll == 6) {
                p2roll = rollDice();
                System.out.println("Player 2 rolled: " + p2roll);
                addPlayer2Score(p2roll);
            }
            System.out.println("Player 2 scores: " + getPlayer2Score());

            if (checkPlayer2Win()) {
                System.out.println("Player 2 wins");
                break;
            }
            System.out.println("");
        }
    }
}

class GameTwo extends DiceGame {

    public void startGame() {
        while (true) {
            int p1roll = rollDice();
            System.out.println("Player 1 rolled: " + p1roll);
            if (p1roll == 6) {
                p1roll = rollDice();
                System.out.println("Player 1 rolled: " + p1roll);
                if (p1roll == 6) {
                    System.out.println("Two 6 in a rows, no score");
                    p1roll = 0;
                }
            }
            addPlayer1Score(p1roll);
            System.out.println("Player 1 scores: " + getPlayer1Score());
            System.out.println("");

            if (checkPlayer1Win()) {
                System.out.println("Player 1 wins");
                break;
            }

            int p2roll = rollDice();
            System.out.println("Player 2 rolled: " + p2roll);
            if (p2roll == 6) {
                p2roll = rollDice();
                System.out.println("Player 2 rolled: " + p2roll);
                if (p2roll == 6) {
                    p2roll = 0;
                }
            }
            addPlayer2Score(p2roll);
            System.out.println("Player 2 scores: " + getPlayer2Score());

            if (checkPlayer2Win()) {
                System.out.println("Player 2 wins");
                break;
            }
            System.out.println("");
        }
    }
}
