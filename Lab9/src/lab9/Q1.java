
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
        Shape shape = new Shape("Shape A");
        shape.setPerimeter(20);
        shape.setArea(25);
        shape.display();
        System.out.println("");

        Rectangle rectangle = new Rectangle("Rectangle");
        rectangle.inputSideLength();
        rectangle.computePerimeterAndArea();
        rectangle.display();
        System.out.println("");

        Square square = new Square("Square");
        square.inputSideLength();
        square.computePerimeterAndArea();
        square.display();
        System.out.println("");

        Circle circle = new Circle("Circle");
        circle.inputDiameter();
        circle.computePerimeterAndArea();
        circle.display();
    }

}

class Shape {

    private String name;
    private double perimeter;
    private double area;

    public Shape(String name) {
        this.name = name;
        this.perimeter = 0.0;
        this.area = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Area: %.2f\n", area);
    }
}

class Rectangle extends Shape {

    private double sideLength1;
    private double sideLength2;

    public Rectangle(String name) {
        super(name);
        sideLength1 = 0;
        sideLength2 = 0;
    }

    public Rectangle(String name, double sideLength1, double sideLength2) {
        super(name);
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    public void inputSideLength() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input side length 1 for %s: ", getName());
        sideLength1 = sc.nextDouble();
        System.out.printf("Input side length 2 for %s: ", getName());
        sideLength2 = sc.nextDouble();
    }

    public void computePerimeterAndArea() {
        setPerimeter(sideLength1 * 2 + sideLength2 * 2);
        setArea(sideLength1 * sideLength2);
    }
}

class Square extends Shape {

    private double sideLength;

    public Square(String name) {
        super(name);
    }

    public Square(String name, double sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    public void inputSideLength() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input side length for %s: ", getName());
        sideLength = sc.nextDouble();
    }

    public void computePerimeterAndArea() {
        setPerimeter(sideLength * 4);
        setArea(sideLength * sideLength);
    }
}

class Circle extends Shape {

    private double diameter;

    public Circle(String name) {
        super(name);
    }

    public Circle(String name, double diameter) {
        super(name);
        this.diameter = diameter;
    }

    public void inputDiameter() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input diameter for %s: ", getName());
        diameter = sc.nextDouble();
    }

    public void computePerimeterAndArea() {
        setPerimeter(diameter * Math.PI);
        setArea(diameter * diameter / 4 * Math.PI);
    }
}
