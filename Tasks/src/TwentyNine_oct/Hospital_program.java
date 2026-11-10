
package TwentyNine_oct;

import java.util.Scanner;

class Patient {

    // Private variables
    private int patientId;
    private String patientName;
    private String disease;
    private int days;
    private double costPerDay;

    // Setter methods
    public void setPatientDetails(int id, String name, String disease,
                                  int days, double costPerDay) {

        this.patientId = id;
        this.patientName = name;
        this.disease = disease;
        this.days = days;
        this.costPerDay = costPerDay;
    }

    // Getter methods
    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDisease() {
        return disease;
    }

    public int getDays() {
        return days;
    }

    // Calculate hospital bill
    public double calculateBill() {
        return days * costPerDay;
    }

    // Display patient details
    public void displayDetails() {

        System.out.println("\n===== PATIENT DETAILS =====");

        System.out.println("Patient ID: " + getPatientId());
        System.out.println("Patient Name: " + getPatientName());
        System.out.println("Disease: " + getDisease());
        System.out.println("Number of Days: " + getDays());
        System.out.println("Total Hospital Bill: Rs." + calculateBill());
    }
}

public class Hospital_program{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient p = new Patient();

        System.out.println("===== HOSPITAL MANAGEMENT SYSTEM =====");

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        System.out.print("Enter Cost Per Day: ");
        double cost = sc.nextDouble();

        p.setPatientDetails(id, name, disease, days, cost);

        p.displayDetails();

        sc.close();
    }
}
