package Twelve_oct;
import java.util.Scanner;

public class Empployee_prog {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Employee Details
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

        // Salary Calculations
        double hra = basicSalary * 0.20;

        double da = basicSalary * 0.10;

        double grossSalary = basicSalary + hra + da;

        double pf = basicSalary * 0.12;

        double netSalary = grossSalary - pf;

        // Employee Details
        System.out.println("\n------ Employee Details ------");

        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Experience: " + experience + " Years");
        System.out.println("Designation: " + designation);

        //  Salary Details
        System.out.println("\n------ Salary Details ------");

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("PF: " + pf);
        System.out.println("Net Salary: " + netSalary);

        sc.close();
    }
}

