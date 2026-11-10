
package Thirteen_oct;

import java.util.Scanner;

public class Eb_bill_update_prog {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Previous Unit: ");
        int previousUnit = sc.nextInt();

        System.out.print("Enter Current Unit: ");
        int currentUnit = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Type of Building (Home/Shop): ");
        String building = sc.nextLine();

        int units = currentUnit - previousUnit;
        double bill = 0;

        if (units < 0) {
            System.out.println("Invalid meter readings!");
            sc.close();
            return;
        }

        if (building.equalsIgnoreCase("Home")) {

            // Home with concession

            if (units <= 100) {
                bill = units * 2.0;
            }
            else if (units <= 200) {
                bill = (100 * 2.0)
                     + ((units - 100) * 3.0);
            }
            else {
                bill = (100 * 2.0)
                     + (100 * 3.0)
                     + ((units - 200) * 4.0);
            }

            System.out.println("Concession: Applicable");

        }
        else if (building.equalsIgnoreCase("Shop")) {

            // Shop without concession

            if (units <= 100) {
                bill = units * 5.0;
            }
            else if (units <= 200) {
                bill = (100 * 5.0)
                     + ((units - 100) * 6.0);
            }
            else {
                bill = (100 * 5.0)
                     + (100 * 6.0)
                     + ((units - 200) * 8.0);
            }

            System.out.println("Concession: Not Applicable");

        }
        else {
            System.out.println("Invalid building type!");
            sc.close();
            return;
        }

        System.out.println("\n------ EB Bill Details ------");

        System.out.println("Consumer ID: " + id);
        System.out.println("Consumer Name: " + name);
        System.out.println("Previous Unit: " + previousUnit);
        System.out.println("Current Unit: " + currentUnit);
        System.out.println("Units Consumed: " + units);
        System.out.println("Building Type: " + building);
        System.out.println("EB Bill Amount: Rs. " + bill);

        sc.close();
    }
}
