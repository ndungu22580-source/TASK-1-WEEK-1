import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        // Generate random number between 1 and 20
        int secretNumber = rand.nextInt(20) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("I'm thinking of a number between 1 and 20!");

        // Loop until the guess matches the secret number
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++; // Increment the counter

            if (guess > secretNumber) {
                System.out.println("Too high!");
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Congratulations!");
            }
        }

        System.out.println("It took you " + attempts + " attempts to guess correctly.");
        input.close();
    }
}
