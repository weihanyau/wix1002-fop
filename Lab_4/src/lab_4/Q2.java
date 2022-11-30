import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int prevSum = 0;

        for(int i = 1; i <= n; i++){
            prevSum += i;
            sum += prevSum;
        }
        System.out.println(sum);
    }
}