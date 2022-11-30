import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        Random r = new Random();
        int p1 = 0;
        int p2 = 0;

        while(p1 < 100 || p2 < 100){
            System.out.println("P1 Points: " + p1);
            System.out.println("P2 Points: " + p2);
            System.out.println();

            int p1Rolls = 0;
            do{
                p1Rolls = r.nextInt(6) + 1;
                System.out.println("P1 rolled " + p1Rolls);
                p1 += p1Rolls;
                System.out.println("P1 Points: " + p1);
                if(p1 >= 100) {
                    System.out.println("P1 reached 100 points. P1 wins!");
                    return;
                }
            } while(p1Rolls == 6);
            
            System.out.println();

            int p2Rolls = 0;
            do{
                p2Rolls = r.nextInt(6) + 1;
                System.out.println("P2 rolled " + p2Rolls);
                p2 += p2Rolls;
                System.out.println("P2 Points: " + p2);
                if(p2 >= 100){
                    System.out.println("P1 reached 100 points. P1 wins!");
                    return;
                }
            } while(p2Rolls == 6);

        }
    }
}