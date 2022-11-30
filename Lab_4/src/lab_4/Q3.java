import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = 0;
        int sumOfX = 0;
        int sumOfXSquare = 0;
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;

        int N = 0;
    
        System.out.print("Enter a score [negative score to quit]: ");
        while((X = sc.nextInt()) != -1){
            minX = Math.min(minX, X);
            maxX = Math.max(maxX, X);
            sumOfX += X;
            sumOfXSquare += X * X;
            N++;
            System.out.print("Enter a score [negative score to quit]: ");
        }
        double average = (double) sumOfX / N;
        double s = Math.sqrt((sumOfXSquare - (double) sumOfX * sumOfX / N) / (N - 1));
        System.out.println("Minimum Score: " + minX);
        System.out.println("Maximum Score: " + maxX);
        System.out.printf("Average Score: %.2f\n", average);
        System.out.printf("Standard Deviation: %.2f\n", s);
    }
}