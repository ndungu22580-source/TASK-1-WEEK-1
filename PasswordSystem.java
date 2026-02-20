import java.util.Scanner;

public class PasswordSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. thosein);
        String password;
        
        // The loop starts here
        do {
            System.out.print("Enter the password: ");
            password = input.nextLine();
            
            // If the password is NOT "1234", it tells the user and loops back
            if (!password.equals("1234")) {
                System.out.println("Incorrect. Try again.");
            }
            
        } while (!password.equals("1234")); // Condition: Keep looping while password is wrong

        System.out.println("Access Granted");
        input.close();
    }
}