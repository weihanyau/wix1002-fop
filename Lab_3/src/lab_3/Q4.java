import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        //Two player dice game
        //Rolling dice
        Random r = new Random();
        int player1 = 0;
        int player2 = 0;
        
        System.out.printf("Player 1 First Roll: %d\n", player1 = r.nextInt(6) + 1);
        System.out.printf("Player 1 Second Roll: %d\n", player1 = Math.max(player1, r.nextInt(6) + 1));
        System.out.printf("Player 2 First Roll: %d\n", player2 = r.nextInt(6) + 1);
        System.out.printf("Player 2 Second Roll: %d\n", player2 = Math.max(player2, r.nextInt(6) + 1));
        
        if(player1 > player2){
            System.out.println("Player 1 wins");
        } else if(player1 < player2){
            System.out.println("Player 2 wins");
        } else {
            System.out.println("It is a tie");
        }
    }
}
