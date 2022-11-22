
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
        //Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);

        if (operand == '+') {
            System.out.println(num1 + num2);
        } else if (operand == '-') {
            System.out.println(num1 - num2);
        } else if (operand == '*') {
            System.out.println(num1 * num2);
        } else if (operand == '/') {
            System.out.println(num1 / num2);
        }
    }

}
