package Twentyeight_oct;

class Employee {
    int empid;
    String empname;
    double basicSalary;

    Employee(int empid, String empname, double basicSalary) {
        this.empid = empid;
        this.empname = empname;
        this.basicSalary = basicSalary;
    }

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {
    Manager(int id, String name, double salary) {
        super(id, name, salary);
    }
}

class Developer extends Employee {
    Developer(int id, String name, double salary) {
        super(id, name, salary);
    }
}

class Intern extends Employee {
    Intern(int id, String name, double salary) {
        super(id, name, salary);
    }
}

public class Employee_program_inher {
    public static void main(String[] args) {

        Manager m = new Manager(101, "Ravi", 50000);
        Developer d = new Developer(102, "Kiran", 40000);
        Intern i = new Intern(103, "Arun", 15000);

        System.out.println("Manager Details");
        m.display();

        System.out.println("\nDeveloper Details");
        d.display();

        System.out.println("\nIntern Details");
        i.display();
    }
}