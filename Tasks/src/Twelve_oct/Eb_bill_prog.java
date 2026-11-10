package Twelve_oct;
import java.util.Scanner;

public class Eb_bill_prog {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Consumer Details
        System.out.print("Enter Consumer ID: ");
        int consumerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        String consumerName = sc.nextLine();

        System.out.print("Enter Previous Unit: ");
        int previousUnit = sc.nextInt();

        System.out.print("Enter Current Unit: ");
        int currentUnit = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Building Type (Residential/Commercial): ");
        String buildingType = sc.nextLine();

        // Calculate Units
        int units = currentUnit - previousUnit;

        double rate = 0;

        // Check Building Type
        if (units < 0) {
            System.out.println("Invalid meter readings!");
            sc.close();
            return;
        }

        if (buildingType.equalsIgnoreCase("Residential")) {
            rate = 5;
        }
        else if (buildingType.equalsIgnoreCase("Commercial")) {
            rate = 8;
        }
        else {
            System.out.println("Invalid Building Type!");
            sc.close();
            return;
        }

        // Calculate EB Bill
        double billAmount = units * rate;

        // Display Bill
        System.out.println("\n------ ELECTRICITY BILL ------");

        System.out.println("Consumer ID: " + consumerId);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Unit: " + previousUnit);
        System.out.println("Current Unit: " + currentUnit);
        System.out.println("Units Consumed: " + units);
        System.out.println("Building Type: " + buildingType);
        System.out.println("Rate Per Unit: Rs." + rate);
        System.out.println("Total EB Bill: Rs." + billAmount);

        sc.close();
    }
}
