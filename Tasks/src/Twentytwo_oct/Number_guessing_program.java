package Twentytwo_oct;

import java.util.Random;
import java.util.Scanner;

public class Number_guessing_program {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(10) + 1;
        int guess;
        int attempts = 0;

        while (attempts < 3) {

            System.out.print("Guess a number between 1 and 10: ");
            guess = sc.nextInt();

            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed correctly.");
                break;
            } else {
                System.out.println("Wrong guess!");

                if (attempts < 3) {
                    System.out.println("Attempts remaining: " + (3 - attempts));
                } else {
                    System.out.println("You have used all 3 attempts.");
                    System.out.println("The correct number was: " + secretNumber);
                }
            }
        }

        sc.close();
    }

}
