package Thirteen_oct;

import java.util.Scanner;

public class Student_prog_update {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter class: ");
        int studentClass = sc.nextInt();

        System.out.print("Enter subject 1 marks: ");
        int s1 = sc.nextInt();

        System.out.print("Enter subject 2 marks: ");
        int s2 = sc.nextInt();

        System.out.print("Enter subject 3 marks: ");
        int s3 = sc.nextInt();

        int total = s1 + s2 + s3;
        double avg = total / 3.0;

        String grade;

        if (avg > 90) {
            grade = "O Grade";
        } else if (avg >= 75) {
            grade = "A Grade";
        } else if (avg > 50) {
            grade = "B Grade";
        } else if (avg >= 35) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }

        System.out.println("\n------- Student Details -------");
        System.out.println("Name\tClass\tTotal\tAverage\tGrade");
        System.out.println("----------------------------------------");

        System.out.println(name + "\t" + studentClass + "\t"
                + total + "\t" + avg + "\t" + grade);

        System.out.println("----------------------------------------");

        sc.close();
    }

}
