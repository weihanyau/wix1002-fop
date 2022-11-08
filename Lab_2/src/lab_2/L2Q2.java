/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_2;

import java.util.Scanner;

/**
 *
 * @author Wei Han
 */
public class L2Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Down Payment: ");
        double downPayment = sc.nextDouble();
        System.out.print("Enter Interest Rate in %: ");
        double interestRate = sc.nextDouble();
        System.out.print("Enter Loan Duration in Year: ");
        double loanDuration = sc.nextDouble();

        double monthlyPayment = (price - downPayment) * (1 + interestRate * loanDuration / 100) / (loanDuration * 12);

        System.out.printf("%.2f\n", monthlyPayment);
    }
}
