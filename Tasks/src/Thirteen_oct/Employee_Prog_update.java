package Thirteen_oct;

import java.util.Scanner;

public class Employee_Prog_update {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Years of Experience: ");
        int experience = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double increment = 0;
        double bonus = 0;

        if (experience >= 5 &&
                department.equalsIgnoreCase("HR")) {
            increment = basicSalary * 0.10;
        } else if (experience >= 5) {
            increment = basicSalary * 0.05;
        } else if (experience >= 3) {
            increment = basicSalary * 0.03;
        } else {
            increment = 0;
        }

        if (designation.equalsIgnoreCase("Manager")) {
            bonus = 10000;
        } else if (designation.equalsIgnoreCase("Team Lead")) {
            bonus = 5000;
        } else {
            bonus = 2000;
        }

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double pf = basicSalary * 0.12;

        double grossPay = basicSalary + hra + da;
        double netPay = grossPay - pf + increment + bonus;

        System.out.println("\n---------- Employee Details ----------");
        System.out.println("Name\t\t: " + name);
        System.out.println("Employee ID\t: " + id);
        System.out.println("Department\t: " + department);
        System.out.println("Experience\t: " + experience + " years");
        System.out.println("Designation\t: " + designation);

        System.out.println("\n---------- Salary Details ----------");
        System.out.printf("Basic Salary\t: %.2f%n", basicSalary);
        System.out.printf("HRA\t\t: %.2f%n", hra);
        System.out.printf("DA\t\t: %.2f%n", da);
        System.out.printf("PF Deduction\t: %.2f%n", pf);
        System.out.printf("Increment\t: %.2f%n", increment);
        System.out.printf("Bonus\t\t: %.2f%n", bonus);
        System.out.printf("Gross Pay\t: %.2f%n", grossPay);
        System.out.printf("Net Pay\t\t: %.2f%n", netPay);

        sc.close();
    }

}
