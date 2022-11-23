import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);

        int salesVolume = sc.nextInt();
        
        //Condition check
        double commission = 0.0;
        if(salesVolume <= 100){
            commission = salesVolume * 0.05;
        } else if(salesVolume <= 500){
            commission = salesVolume * 0.075;
        } else if(salesVolume <= 1000){
            commission = salesVolume * 0.1;
        } else{
            commission = salesVolume * 0.125;
        }

        //Output in two decimal places
        System.out.printf("Commision: %.2f", commission);
    }
}
