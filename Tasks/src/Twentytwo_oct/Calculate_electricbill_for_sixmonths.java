package Twentytwo_oct;

import java.util.Scanner;

public class Calculate_electricbill_for_sixmonths {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double units, bill;
        double totalBill = 0;

        for (int month = 1; month <= 6; month++) {

            System.out.print("Enter units consumed in month " + month + ": ");
            units = sc.nextDouble();

            if (units <= 100) {
                bill = units * 2;
            } else if (units <= 200) {
                bill = (100 * 2) + ((units - 100) * 3);
            } else {
                bill = (100 * 2) + (100 * 3)
                        + ((units - 200) * 4);
            }

            System.out.println("Month " + month + " bill: Rs. " + bill);

            totalBill = totalBill + bill;
        }

        System.out.println("-------------------------");
        System.out.println("Total bill for 6 months: Rs. " + totalBill);

        sc.close();
    }

}
