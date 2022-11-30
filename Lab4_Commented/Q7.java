
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = sc.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int N = sc.nextInt();

        double M = (P * i / (12 * 100)) / (1 - Math.pow(1 + i / (12 * 100), -N));

        //Print out the header
        System.out.printf("%-10s%20s%15s%15s%15s%15s\n", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");

        double totalInterest = 0;

        for (int n = 1; n <= N; n++) {
            double Cn = M * Math.pow((1 + i / (12 * 100)), -(1 + N - n));
            double Ln = M - Cn;
            double Rn = Ln / (i / (12 * 100)) - Cn;
            totalInterest += Ln;
            System.out.printf("%-10d%20.2f%15.2f%15.2f%15.2f%15.2f\n", n, M, Cn, Ln, Rn, totalInterest);
        }
    }
}
