
package Twentyeight_oct;

import java.util.Scanner;

// Car Rental class
class CarRental {

    // Rental based on hours
    void calculateRental(int hours) {

        double amount = hours * 200;

        System.out.println("Rental based on Hours");
        System.out.println("Total Hours: " + hours);
        System.out.println("Total Amount: Rs." + amount);
    }

    // Rental based on days
    void calculateRental(int days, boolean daily) {

        double amount = days * 1500;

        System.out.println("Rental based on Days");
        System.out.println("Total Days: " + days);
        System.out.println("Total Amount: Rs." + amount);
    }

    // Rental with or without driver
    void calculateRental(int days, boolean driver, double driverCharge) {

        double amount = days * 1500;

        if (driver) {
            amount = amount + (days * driverCharge);
            System.out.println("Driver Required: Yes");
        } else {
            System.out.println("Driver Required: No");
        }

        System.out.println("Total Days: " + days);
        System.out.println("Total Amount: Rs." + amount);
    }
}

// Main class
public class Car_rental_program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CarRental car = new CarRental();

        System.out.println("===== CAR RENTAL SYSTEM =====");

        System.out.println("1. Rental by Hours");
        System.out.println("2. Rental by Days");
        System.out.println("3. Rental with/without Driver");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter number of hours: ");
                int hours = sc.nextInt();

                car.calculateRental(hours);
                break;

            case 2:
                System.out.print("Enter number of days: ");
                int days = sc.nextInt();

                car.calculateRental(days, true);
                break;

            case 3:
                System.out.print("Enter number of days: ");
                int rentalDays = sc.nextInt();

                System.out.print("Do you need a driver? (true/false): ");
                boolean driver = sc.nextBoolean();

                System.out.print("Enter driver charge per day: ");
                double driverCharge = sc.nextDouble();

                car.calculateRental(rentalDays, driver, driverCharge);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
