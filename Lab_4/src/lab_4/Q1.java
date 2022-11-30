import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        
        int num = sc.nextInt();

        System.out.print("The factors are: ");
        for(int i = 1; i <= num; i++){
            if(24 % i != 0) continue;
            System.out.print(i);
            if(i != num){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}