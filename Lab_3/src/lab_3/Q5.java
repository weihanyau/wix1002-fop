import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //Input a,b,c,d,e,f
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a, b, c, d, e, f: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        //Validae ad - bc
        int adMinusbc = a * d - b * c;

        if(adMinusbc == 0){
            System.out.println("The equation has no solution");
            return;
        }

        double x = (double) (e * d - b * f) / adMinusbc;
        double y = (double) (a * f - e * c) / adMinusbc;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
