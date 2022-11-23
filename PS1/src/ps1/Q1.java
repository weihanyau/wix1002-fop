
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Wei Han
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Enter coordinate X and Y
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coordinate X and Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the move: ");
        //Input moves
        String movesString = sc.nextLine();
        char[] moves = movesString.toCharArray();

        System.out.printf("Initial Coordinate (%d, %d)\n", x, y);

        //Go through the moves array and update X and Y accordingly
        for (int i = 0; i < moves.length; i++) {
            //Can replace with switch statement since if you want, it's more efficient too!
            if (moves[i] == 'L') {
                x -= 1;
            } else if (moves[i] == 'R') {
                x += 1;
            } else if (moves[i] == 'U') {
                y += 1;
            } else if (moves[i] == 'D') {
                y -= 1;
            }
        }
        System.out.printf("Final Coordinate (%d, %d)\n", x, y);
    }
}
