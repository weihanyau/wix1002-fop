import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //Input radius of a circle and x,y

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        //Use Pythagoras to find distance to point from 0,0
        double distanceToXY = Math.sqrt(x * x + y * y);

        //If distance is smaller than or equal to radius, it is inside the circle
        if(distanceToXY <= radius){
            System.out.println("The point is inside the circle");
        } else {
            System.out.println("The point is outside the circle");
        }
    }
}