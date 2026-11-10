
package Twentysix_oct;

import java.util.Scanner;

public class Hose_rent {

    // Method to calculate rent
    double calculateRent(double monthlyRent, int months) {
        return monthlyRent * months;
    }

    // Method to calculate lease amount
    double calculateLease(double leaseAmount) {
        return leaseAmount;
    }

    // Method to display house details
    void display(String name, String houseType,
                 String agreementType, double amount) {

        System.out.println("\nOwner Name: " + name);
        System.out.println("House Type: " + houseType);
        System.out.println("Agreement Type: " + agreementType);
        System.out.println("Total Amount: Rs. " + amount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hose_rent h = new Hose_rent();

        String choice;

        do {

            System.out.print("\nEnter number of houses: ");
            int n = sc.nextInt();

            String[] owner = new String[n];
            String[] houseType = new String[n];
            String[] agreementType = new String[n];
            double[] amount = new double[n];

            // Input using for loop
            for (int i = 0; i < n; i++) {

                System.out.println("\n--- House " + (i + 1) + " ---");

                System.out.print("Enter owner name: ");
                owner[i] = sc.next();

                System.out.println("\nSelect House Type:");
                System.out.println("1. 1BHK");
                System.out.println("2. 2BHK");

                int type = sc.nextInt();

                if (type == 1) {
                    houseType[i] = "1BHK";
                } else if (type == 2) {
                    houseType[i] = "2BHK";
                } else {
                    System.out.println("Invalid house type!");
                    i--;
                    continue;
                }

                System.out.println("\nSelect Agreement Type:");
                System.out.println("1. Rent");
                System.out.println("2. Lease");

                int agreement = sc.nextInt();

                if (agreement == 1) {

                    agreementType[i] = "Rent";

                    System.out.print("Enter monthly rent: ");
                    double rent = sc.nextDouble();

                    System.out.print("Enter number of months: ");
                    int months = sc.nextInt();

                    amount[i] = h.calculateRent(rent, months);

                } else if (agreement == 2) {

                    agreementType[i] = "Lease";

                    System.out.print("Enter lease amount: ");
                    double lease = sc.nextDouble();

                    amount[i] = h.calculateLease(lease);

                } else {

                    System.out.println("Invalid agreement type!");
                    i--;
                }
            }

            // Display all house details
            System.out.println("\n===== HOUSE REPORT =====");

            for (int i = 0; i < n; i++) {

                h.display(
                    owner[i],
                    houseType[i],
                    agreementType[i],
                    amount[i]
                );
            }

            System.out.print("\nDo you want to calculate again? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\nThank you!");

        sc.close();
    }
}
