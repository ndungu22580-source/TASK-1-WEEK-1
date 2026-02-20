import java.util.Scanner;

public class calculateFare{

    // The main method: The starting point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Create an instance of the class to call the non-static method
        FareCalculator calculator = new FareCalculator();

        System.out.print("Enter distance traveled (km): ");
        double distance = input.nextDouble();

        // Calling the method and storing the result
        double result = calculator.calculateFare(distance);

        System.out.println("The total fare is: KSh. " + result);
        
        input.close();
    }

    // The method requested in your prompt
    public double calculateFare(double distance) {
        return distance * 50.0;
    }
}