import java.util.Scanner;

public class CylinderCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for radius and height
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();

        // Calculations based on provided formulas
        // Volume = π * r^2 * h
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Surface Area = 2 * π * r^2 + 2 * π * r * h
        double surfaceArea = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);

        // Output results
        System.out.println("Results ");
        System.out.printf("Volume: %.2f\n", volume);
        System.out.printf("Surface Area: %.2f\n", surfaceArea);

        input.close();
    }
}