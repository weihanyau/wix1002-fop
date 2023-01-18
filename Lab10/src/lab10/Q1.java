/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Wei Han
 */
public class Q1 {

    public static void main(String[] args) {

        PermanentEmployee employee1 = new PermanentEmployee("Ali", 'A');
        System.out.println(employee1);
        ContractStaff employee2 = new ContractStaff("Abu", 500);
        System.out.println(employee2);
        TemporaryStaff employee3 = new TemporaryStaff("Alvin", 50);
        System.out.println(employee3);
    }
}

abstract class Employee {

    private String name;
    private String type;
    protected double totalSalaryPerMonth;

    public Employee(String name, String type, double totalSalaryPerMonth) {
        this.name = name;
        this.type = type;
        this.totalSalaryPerMonth = totalSalaryPerMonth;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + "\nType: " + type
                + "\nTotal salary per month: " + totalSalaryPerMonth
                + "\n";
    }
}

class PermanentEmployee extends Employee {

    public PermanentEmployee(String name, char category) {
        super(name, "Permanent Employee", 0);
        switch (category) {
            case 'A':
                totalSalaryPerMonth = 4000;
                break;
            case 'B':
                totalSalaryPerMonth = 3000;
                break;
            case 'C':
                totalSalaryPerMonth = 2000;
        }
    }
}

class ContractStaff extends Employee {

    public ContractStaff(String name, double totalSales) {
        super(name, "Contract Staff", 500 + .5 * totalSales);
    }
}

class TemporaryStaff extends Employee {

    public TemporaryStaff(String name, int hours) {
        super(name, "Temporary Staff", 15 * hours);
    }
}
