/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Wei Han
 */
public class Q3 {

    public static void main(String[] args) {
        WeightCalculator user = new WeightCalculator(20, 170);
        System.out.println(user);
    }
}

class WeightCalculator {

    //Initialize age, height and recommendWeight
    private int age;
    private double height;
    private double recommendWeight;

    //Constructor for intializing value
    public WeightCalculator(int age, double height) {
        this.age = age;
        this.height = height;
        recommendWeight = calculateRecommendWeight();
    }

    //Method for calculating recommend weight
    public double calculateRecommendWeight() {
        return (height - 100 + age / 10) * 0.9;
    }

    //Overriding toString method to print out class variables
    @Override
    public String toString() {
        return "Age = " + age + "\n"
                + "Height = " + height + "\n"
                + "Recommend Weight = " + recommendWeight;
    }
}
