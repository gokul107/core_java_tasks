
package TwentyNine_oct;

import java.util.Scanner;

// Interface
interface CabBooking {

    void bookRide();

    double calculateCabFare();
}

// Base class
class CustomerDetails {

    String customerName;
    double distance;

    CustomerDetails(String customerName, double distance) {

        this.customerName = customerName;
        this.distance = distance;
    }
}

// Mini Cab
class MiniCab extends CustomerDetails implements CabBooking {

    MiniCab(String name, double distance) {
        super(name, distance);
    }

    public void bookRide() {
        System.out.println("Mini Cab Booked Successfully");
    }

    public double calculateCabFare() {
        return distance * 12;
    }
}

// Sedan Cab
class SedanCab extends CustomerDetails implements CabBooking {

    SedanCab(String name, double distance) {
        super(name, distance);
    }

    public void bookRide() {
        System.out.println("Sedan Cab Booked Successfully");
    }

    public double calculateCabFare() {
        return distance * 15;
    }
}

// SUV Cab
class SUVCab extends CustomerDetails implements CabBooking {

    SUVCab(String name, double distance) {
        super(name, distance);
    }

    public void bookRide() {
        System.out.println("SUV Cab Booked Successfully");
    }

    public double calculateCabFare() {
        return distance * 20;
    }
}

// Main class
public class CabBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CAB BOOKING SYSTEM =====");

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Distance in KM: ");
        double distance = sc.nextDouble();

        System.out.println("\nSelect Cab Type");
        System.out.println("1. Mini Cab - Rs.12 per KM");
        System.out.println("2. Sedan Cab - Rs.15 per KM");
        System.out.println("3. SUV Cab - Rs.20 per KM");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        CabBooking cab = null;

        switch (choice) {

            case 1:
                cab = new MiniCab(name, distance);
                break;

            case 2:
                cab = new SedanCab(name, distance);
                break;

            case 3:
                cab = new SUVCab(name, distance);
                break;

            default:
                System.out.println("Invalid Cab Choice");
                sc.close();
                return;
        }

        cab.bookRide();

        System.out.println("Customer Name: " + name);
        System.out.println("Distance: " + distance + " KM");
        System.out.println("Total Cab Fare: Rs." + cab.calculateCabFare());

        sc.close();
    }
}
