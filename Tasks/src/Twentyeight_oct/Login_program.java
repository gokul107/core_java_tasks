
package Twentyeight_oct;

import java.util.Scanner;

class Login {

    // Login using username and password
    void login(String username, String password) {

        System.out.println("Login using Username");
        System.out.println("Username: " + username);
        System.out.println("Login Successful");
    }

    // Login using ID and password
    void login(int id, String password) {

        System.out.println("Login using ID");
        System.out.println("ID: " + id);
        System.out.println("Login Successful");
    }

    // Login using password and mobile number
    void login(String password, long mobileNumber) {

        System.out.println("Login using Mobile Number");
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Login Successful");
    }
}

public class Login_program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Login obj = new Login();

        System.out.println("===== LOGIN SYSTEM =====");

        System.out.println("1. Login using Username");
        System.out.println("2. Login using ID");
        System.out.println("3. Login using Mobile Number");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Username: ");
                String username = sc.next();

                System.out.print("Enter Password: ");
                String password1 = sc.next();

                obj.login(username, password1);
                break;

            case 2:
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Password: ");
                String password2 = sc.next();

                obj.login(id, password2);
                break;

            case 3:
                System.out.print("Enter Mobile Number: ");
                long mobile = sc.nextLong();

                System.out.print("Enter Password: ");
                String password3 = sc.next();

                obj.login(password3, mobile);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
