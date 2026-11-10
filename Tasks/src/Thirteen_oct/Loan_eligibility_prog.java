
package Thirteen_oct;

import java.util.Scanner;

public class Loan_eligibility_prog {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Applicant Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employment Type (Salaried/Self-Employed): ");
        String employment = sc.nextLine();

        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter CIBIL Score: ");
        int cibil = sc.nextInt();

        // Calculate Annual Salary
        double annualSalary = salary * 12;

        System.out.println("\n------ LOAN DETAILS ------");

        System.out.println("Applicant Name: " + name);
        System.out.println("Employment Type: " + employment);
        System.out.println("Monthly Salary: Rs. " + salary);
        System.out.println("Annual Salary: Rs. " + annualSalary);
        System.out.println("CIBIL Score: " + cibil);

        // Loan Eligibility Checking

        if (employment.equalsIgnoreCase("Salaried")
                && annualSalary > 150000
                && cibil >= 750) {

            System.out.println("\nFINAL DECLARATION:");
            System.out.println("Congratulations!");
            System.out.println("You are ELIGIBLE for the Loan.");

        } else {

            System.out.println("\nFINAL DECLARATION:");
            System.out.println("Sorry!");
            System.out.println("You are NOT ELIGIBLE for the Loan.");

        }

        sc.close();
    }
}
