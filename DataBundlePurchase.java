import java.util.Scanner;

public class DataBundlePurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Displays the menu
        System.out.println("Option\tBundle\tCost (KES)");
        System.out.println("1\t100 MB\t50");
        System.out.println("2\t500 MB\t200");
        System.out.println("3\t1 GB\t350");
        System.out.println("4\t2 GB\t600");

        // 2. Asks the user to enter their choice (1-4)
        System.out.print("\nEnter your choice (1-4): ");
        int choice = input.nextInt();

        // 3. Uses a switch statement to display the bundle selected and its cost
        switch (choice) {
            case 1:
                System.out.println("Bundle Selected: 100 MB");
                System.out.println("Cost: 50 KES");
                break;
            case 2:
                System.out.println("Bundle Selected: 500 MB");
                System.out.println("Cost: 200 KES");
                break;
            case 3:
                System.out.println("Bundle Selected: 1 GB");
                System.out.println("Cost: 350 KES");
                break;
            case 4:
                System.out.println("Bundle Selected: 2 GB");
                System.out.println("Cost: 600 KES");
                break;
            // 4. Displays "Invalid choice" if the user enters a number outside 1-4
            default:
                System.out.println("Invalid choice");
                break;
        }

        input.close();
    }
}