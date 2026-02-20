import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.println("--- Enter Your Details ---");

        // i. Prompt for Height
        System.out.print("Enter your height (in meters/cm): ");
        float height = input.nextFloat();

        // ii. Prompt for Bank Balance
        System.out.print("Enter your bank balance (KES): ");
        double bankBalance = input.nextDouble();

        // iii. Prompt for Phone Number
        // Using String to ensure leading zeros in phone numbers are not lost
        System.out.print("Enter your phone number:");
        String phoneNumber = input.next();

        // Displaying the values back to the user in a formatted manner
        System.out.println("Summary of Information:");
        System.out.println("Height:" + height);
        System.out.printf("Bank Balance:  KES %,.2f%n", bankBalance);
        System.out.println("Phone Number:  " + phoneNumber);

        // Close the scanner
        input.close();
    }
}