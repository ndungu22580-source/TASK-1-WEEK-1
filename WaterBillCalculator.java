import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalBill = 0;

        System.out.print("Enter water units consumed: ");
        double units = input.nextDouble();

        if (units <= 30) {
            totalBill = units * 20;
        } else if (units <= 60) {
            // First 30 at 20, the rest at 25
            totalBill = (30 * 20) + ((units - 30) * 25);
        } else {
            // First 30 at 20, next 30 at 25, the rest at 30
            totalBill = (30 * 20) + (30 * 25) + ((units - 60) * 30);
        }

        System.out.printf("Total water bill: %.2f KES\n", totalBill);
        input.close();
    }
}