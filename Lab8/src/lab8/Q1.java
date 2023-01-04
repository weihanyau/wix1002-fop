
import java.util.Random;

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
        Number a = new Number();
        Number b = new Number(5);
        Number c = new Number(4, 50);

        System.out.println("Number a");
        a.displayAll();
        System.out.println("\nNumber b");
        b.displayAll();
        System.out.println("\nNumber c");
        c.displayAll();
    }
}

class Number {

    //Declare private array to store numbers
    private int[] numbers;

    //Empty parameter constructor
    public Number() {
        this(10, 100);
    }

    //Constructor with total number of number as parameter
    public Number(int N) {
        this(N, 100);
    }

    //Constructor with 2 int as parameter with total number and max random value
    //Populate the number array by generating random number based on total number
    //and max random value
    public Number(int N, int max) {
        Random random = new Random();
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = random.nextInt(max + 1);
        }
    }

    //Method to display all numbers
    public void displayAll() {
        displayAllNumbers();
        displayEvenNumbers();
        displayPrimeNumbers();
        displayMaximumNumber();
        displayMinimumNumber();
        displayAverage();
        displaySquareNumber();
    }

    //Method to display all numbers
    public void displayAllNumbers() {
        System.out.print("All numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //Method to display event numbers
    public void displayEvenNumbers() {
        System.out.print("Even numbers: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    //Method to find and display prime numbers
    public void displayPrimeNumbers() {
        System.out.print("Prime numbers: ");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        boolean isPrime = true;
        for (int i = 3; i < num; i += 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    //Method to find and display maximum number
    public void displayMaximumNumber() {
        int maximum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            maximum = Math.max(maximum, numbers[i]);
        }
        System.out.println("Maximum number: " + maximum);
    }

    //Method to find and display minimum number
    public void displayMinimumNumber() {
        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            minimum = Math.min(minimum, numbers[i]);
        }
        System.out.println("Minimum number: " + minimum);
    }

    //Method to find and display average
    public void displayAverage() {
        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            sum += num;
            count++;
        }
        System.out.println("Average: " + ((double) sum / count));
    }

    //Method to find and display square number
    public void displaySquareNumber() {
        System.out.print("Square number: ");
        for (int num : numbers) {
            double root = Math.sqrt(num);
            //Compare the root value with the root value but removed decimal place
            if (root == (int) root) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

}
