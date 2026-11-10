
package Twentyseven_oct;

class Student {

    String name;
    int rollNo;
    int marks;

    // Parameterized constructor
    Student(String name, int rollNo, int marks) {

        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Display student details
    void display() {

        System.out.println("\n----- STUDENT DETAILS -----");
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

// Main class
public class ConstructorProgram {

    public static void main(String[] args) {

        Student s1 = new Student("Gokul", 101, 85);

        Student s2 = new Student("Chaitanya", 102, 90);

        s1.display();
        s2.display();
    }
}
