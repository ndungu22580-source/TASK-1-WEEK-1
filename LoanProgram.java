import java.util.Scanner;

public class LoanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User-friendly prompts
        System.out.println("Welcome to the Bank Loan Eligibility Checker");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        System.out.print("Please enter your annual income (Sh): ");
        double income = input.nextDouble();

        // Logic: Age must be >= 21 AND income must be >= 21,000
        if (age >= 21 && income >= 21000) {
            System.out.println("\nCongratulations, you qualify for a loan.");
        } else {
            System.out.println("\nUnfortunately, we are unable to offer you a loan at this time.");
        }

        input.close();
    }
}