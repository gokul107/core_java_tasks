
package Twentysix_oct;

import java.util.Scanner;

public class Temp_patient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int patients = sc.nextInt();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        System.out.print("Enter readings per day: ");
        int readings = sc.nextInt();

        sc.nextLine();

        String[] names = new String[patients];

        double[][][] temperatures =
                new double[patients][days][readings];

        double[] averages = new double[patients];

        boolean[] fever = new boolean[patients];

        // Collect patient details and temperatures
        for (int i = 0; i < patients; i++) {

            System.out.print("\nEnter patient name: ");
            names[i] = sc.nextLine();

            double total = 0;

            // Loop through days
            for (int j = 0; j < days; j++) {

                System.out.println("Day " + (j + 1));

                // Loop through temperature readings
                for (int k = 0; k < readings; k++) {

                    System.out.print(
                            "Temperature reading " + (k + 1)
                                    + " in Celsius: ");

                    temperatures[i][j][k] = sc.nextDouble();

                    total += temperatures[i][j][k];
                }
            }

            // Calculate average temperature
            averages[i] = total / (days * readings);

            // Check fever condition
            for (int j = 0; j < days; j++) {

                for (int k = 0; k < readings; k++) {

                    if (temperatures[i][j][k] >= 38.0) {
                        fever[i] = true;
                    }
                }
            }

            sc.nextLine();
        }

        // Display patient report
        System.out.println("\n===== PATIENT TEMPERATURE REPORT =====");

        for (int i = 0; i < patients; i++) {

            System.out.println("\nPatient: " + names[i]);

            System.out.printf(
                    "Average Temperature: %.2f°C%n",
                    averages[i]);

            if (fever[i]) {

                System.out.println(
                        "Status: Possible fever detected");

                System.out.println(
                        "Action: Medical assessment recommended");

            } else {

                System.out.println(
                        "Status: No fever-level reading detected");

                System.out.println(
                        "Action: Follow the clinician's care plan");
            }
        }

        sc.close();
    }
}