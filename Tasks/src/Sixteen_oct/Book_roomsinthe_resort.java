package Sixteen_oct;

import java.util.Scanner;

public class Book_roomsinthe_resort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int room, days;
        double price = 0, total;

        System.out.println("----- WELCOME TO RESORT -----");
        System.out.println("1. Standard Room - Rs. 2000/day");
        System.out.println("2. Deluxe Room   - Rs. 3500/day");
        System.out.println("3. Suite Room    - Rs. 5000/day");

        System.out.print("Select room type: ");
        room = sc.nextInt();

        switch (room) {
            case 1:
                price = 2000;
                System.out.println("You selected Standard Room");

                System.out.println("1. 1 Day");
                System.out.println("2. 2 Days");
                System.out.println("3. 3 Days");
                System.out.print("Select stay duration: ");
                days = sc.nextInt();

                switch (days) {
                    case 1:
                        total = price * 1;
                        System.out.println("Total bill: Rs. " + total);
                        break;
                    case 2:
                        total = price * 2;
                        System.out.println("Total bill: Rs. " + total);
                        break;
                    case 3:
                        total = price * 3;
                        System.out.println("Total bill: Rs. " + total);
                        break;
                    default:
                        System.out.println("Invalid duration");
                }
                break;

            case 2:
                price = 3500;
                System.out.println("You selected Deluxe Room");

                System.out.println("1. 1 Day");
                System.out.println("2. 2 Days");
                System.out.println("3. 3 Days");
                System.out.print("Select stay duration: ");
                days = sc.nextInt();

                switch (days) {
                    case 1:
                        total = price * 1;
                        System.out.println("Total bill: Rs. " + total);
                        break;
                    case 2:
                        total = price * 2;
                        System.out.println("Total bill: Rs. " + total);
                        break;
                    case 3:
                        total = price * 3;
                        System.out.println("Total bill: Rs. " + total);
                        break;
                    default:
                        System.out.println("Invalid duration");
                }
                break;

            case 3:
                price = 5000;
                System.out.println("You selected Suite Room");

                System.out.println("1. 1 Day");
                System.out.println("2. 2 Days");
                System.out.println("3. 3 Days");
                System.out.print("Select stay duration: ");
                days = sc.nextInt();

                switch (days) {
                    case 1:
                        total = price * 1;
                        System.out.println("Total bill: Rs. " + total);
                        break;
                    case 2:
                        total = price * 2;
                        System.out.println("Total bill: Rs. " + total);
                        break;
                    case 3:
                        total = price * 3;
                        System.out.println("Total bill: Rs. " + total);
                        break;
                    default:
                        System.out.println("Invalid duration");
                }
                break;

            default:
                System.out.println("Invalid room selection");
        }

        sc.close();
    }

}
