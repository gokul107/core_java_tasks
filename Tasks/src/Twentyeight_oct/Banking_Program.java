package Twentyeight_oct;

import java.util.Scanner;

class Banking {

    // Deposit using cash
    void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
            return;
        }

        System.out.println("Deposit Method: Cash");
        System.out.println("Deposited Amount: Rs." + amount);
        System.out.println("Cash Deposit Successful");
    }

    // Deposit using cheque
    void deposit(double amount, int checkNumber) {

        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
            return;
        }

        System.out.println("Deposit Method: Cheque");
        System.out.println("Cheque Number: " + checkNumber);
        System.out.println("Deposited Amount: Rs." + amount);
        System.out.println("Cheque Deposit Successful");
    }

    // Deposit using UPI
    void deposit(double amount, String upiId, String bankName) {

        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
            return;
        }

        System.out.println("Deposit Method: UPI");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Deposited Amount: Rs." + amount);
        System.out.println("UPI Deposit Successful");
    }
}

public class Banking_Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Banking obj = new Banking();

        System.out.println("===== BANKING SYSTEM =====");

        System.out.println("1. Deposit using Cash");
        System.out.println("2. Deposit using Cheque");
        System.out.println("3. Deposit using UPI");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:

                System.out.print("Enter deposit amount: ");
                double amount1 = sc.nextDouble();

                obj.deposit(amount1);
                break;

            case 2:

                System.out.print("Enter deposit amount: ");
                double amount2 = sc.nextDouble();

                System.out.print("Enter cheque number: ");
                int checkNumber = sc.nextInt();

                obj.deposit(amount2, checkNumber);
                break;

            case 3:

                System.out.print("Enter deposit amount: ");
                double amount3 = sc.nextDouble();

                System.out.print("Enter UPI ID: ");
                String upiId = sc.next();

                System.out.print("Enter bank name: ");
                String bankName = sc.next();

                obj.deposit(amount3, upiId, bankName);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
