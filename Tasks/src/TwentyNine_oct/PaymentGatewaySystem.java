
package TwentyNine_oct;

import java.util.Scanner;

// Interface
interface PaymentGateway {

    void processPayment(double amount);
}

// UPI Payment
class UPIPayment implements PaymentGateway {

    public void processPayment(double amount) {

        System.out.println("Payment Method: UPI");
        System.out.println("Amount Paid: Rs." + amount);
        System.out.println("UPI Payment Successful");
    }
}

// Credit Card Payment
class CreditCardPayment implements PaymentGateway {

    public void processPayment(double amount) {

        System.out.println("Payment Method: Credit Card");
        System.out.println("Amount Paid: Rs." + amount);
        System.out.println("Credit Card Payment Successful");
    }
}

// Net Banking Payment
class NetBankingPayment implements PaymentGateway {

    public void processPayment(double amount) {

        System.out.println("Payment Method: Net Banking");
        System.out.println("Amount Paid: Rs." + amount);
        System.out.println("Net Banking Payment Successful");
    }
}

// Main class
public class PaymentGatewaySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== PAYMENT GATEWAY SYSTEM =====");

        System.out.println("1. UPI Payment");
        System.out.println("2. Credit Card Payment");
        System.out.println("3. Net Banking Payment");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Payment Amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid Payment Amount");
            sc.close();
            return;
        }

        PaymentGateway payment = null;

        switch (choice) {

            case 1:
                payment = new UPIPayment();
                break;

            case 2:
                payment = new CreditCardPayment();
                break;

            case 3:
                payment = new NetBankingPayment();
                break;

            default:
                System.out.println("Invalid Payment Choice");
                sc.close();
                return;
        }

        payment.processPayment(amount);

        sc.close();
    }
}
