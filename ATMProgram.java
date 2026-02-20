import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Initializing a starting balance
        double balance = 500.00; 
        System.out.println("Starting Balance: $" + balance);

        // The loop continues as long as balance is greater than 0
        while (balance > 0) {
            System.out.print("Enter amount to withdraw: ");
            double withdrawal = input.nextDouble();
            
            balance -= withdrawal; // Subtract withdrawal from balance
            
            System.out.println("Current Balance: $" + balance);
        }

        System.out.println("Transaction complete. Final balance is zero or negative.");
        input.close();
    }
}