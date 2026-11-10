
package Twentysix_oct;

import java.util.Scanner;

public class ATM {

    static double balance = 10000;

    // Method to deposit money
    static void deposit(Scanner sc) {

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully");
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Method to withdraw money
    static void withdraw(Scanner sc) {

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Please collect your cash");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Method to check balance
    static void checkBalance() {

        System.out.println("Available Balance: Rs. " + balance);
    }

    // Method to transfer money
    static void transfer(Scanner sc) {

        System.out.print("Enter receiver account number: ");
        String account = sc.next();

        System.out.print("Enter transfer amount: ");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;

            System.out.println("Amount transferred successfully");
            System.out.println("Receiver Account: " + account);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    deposit(sc);
                    break;

                case 2:
                    withdraw(sc);
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    transfer(sc);
                    break;

                case 5:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
