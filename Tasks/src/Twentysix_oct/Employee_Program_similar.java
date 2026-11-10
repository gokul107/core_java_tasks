package Twentysix_oct;

import java.util.Scanner;

public class Employee_Program_similar {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of employees
        System.out.print("Enter number of employees: ");
        int employees = sc.nextInt();
        sc.nextLine();

        String[] names = new String[employees];
        int[] ids = new int[employees];
        double[] salaries = new double[employees];

        // Input employee details
        for (int i = 0; i < employees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter employee name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter employee ID: ");
            ids[i] = sc.nextInt();

            System.out.print("Enter monthly salary: ");
            salaries[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Find highest-paid and lowest-paid employees
        int highestIndex = 0;
        int lowestIndex = 0;

        for (int i = 1; i < employees; i++) {
            if (salaries[i] > salaries[highestIndex]) {
                highestIndex = i;
            }

            if (salaries[i] < salaries[lowestIndex]) {
                lowestIndex = i;
            }
        }

        // Display employee report
        System.out.println("\n========== EMPLOYEE REPORT ==========");
        System.out.printf("%-20s %-15s %-15s%n",
                "Name", "Employee ID", "Salary");

        for (int i = 0; i < employees; i++) {
            System.out.printf("%-20s %-15d %.2f%n",
                    names[i], ids[i], salaries[i]);
        }

        // Display highest-paid employee
        System.out.println("\n===== HIGHEST-PAID EMPLOYEE =====");
        System.out.println("Name: " + names[highestIndex]);
        System.out.println("Employee ID: " + ids[highestIndex]);
        System.out.printf("Monthly Salary: %.2f%n",
                salaries[highestIndex]);

        // Display lowest-paid employee
        System.out.println("\n===== LOWEST-PAID EMPLOYEE =====");
        System.out.println("Name: " + names[lowestIndex]);
        System.out.println("Employee ID: " + ids[lowestIndex]);
        System.out.printf("Monthly Salary: %.2f%n",
                salaries[lowestIndex]);

        sc.close();
    }

}
