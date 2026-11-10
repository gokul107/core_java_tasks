package Thirteen_oct;
import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Registered details
        String registeredUsername = "gokul123";
        String registeredPassword = "Gokul@123";
        String registeredPhone = "9876543210";

        // Login details
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        // Login validation
        if (username.equals(registeredUsername)
                && password.equals(registeredPassword)
                && phone.equals(registeredPhone)) {

            System.out.println("\nLogin Successful!");
            System.out.println("Welcome " + username);

        } else {
            System.out.println("\nInvalid Username, Password or Phone Number!");
            System.out.println("Login Failed!");
        }

        sc.close();
    }
}
