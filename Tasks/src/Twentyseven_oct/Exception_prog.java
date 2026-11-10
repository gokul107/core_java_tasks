
package Twentyseven_oct;

import java.util.Scanner;

// Custom Exception class
class InvalidMarksException extends Exception {

    InvalidMarksException(String message) {
        super(message);
    }
}

// Main class
public class Exception_prog {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {

                throw new InvalidMarksException(
                    "Invalid marks! Marks must be between 0 and 100."
                );
            }

            System.out.println("\nStudent Name: " + name);
            System.out.println("Student Marks: " + marks);
            System.out.println("Marks are valid.");

        } catch (InvalidMarksException e) {

            System.out.println("Custom Exception: " + e.getMessage());

        } finally {

            sc.close();
        }
    }
}
