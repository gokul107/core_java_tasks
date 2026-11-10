package Twelve_oct;
 import java.util.Scanner;

public class Student_prog {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Class: ");
        String studentClass = sc.nextLine();

        // Get subject marks
        System.out.print("Enter Subject 1 Marks: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter Subject 3 Marks: ");
        int mark3 = sc.nextInt();

        // Calculate total and average
        int total = mark1 + mark2 + mark3;

        double average = total / 3.0;

        // Display student details
        System.out.println("\n----- Student Details -----");

        System.out.println("Student Name: " + name);
        System.out.println("Student Class: " + studentClass);

        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}
