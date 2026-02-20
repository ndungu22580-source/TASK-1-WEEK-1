import java.util.Scanner;
import java.util.Random;

public class HotelManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // --- 1D Array: Weekly Revenue Tracker ---
        System.out.println("=== Part 1: Weekly Revenue Tracker ===");
        double[] revenue = new double[7];
        double totalRevenue = 0;

        for (int i = 0; i < revenue.length; i++) {
            System.out.print("Enter revenue for day " + (i + 1) + ": ");
            revenue[i] = scanner.nextDouble();
            totalRevenue += revenue[i];
        }

        double averageRevenue = totalRevenue / revenue.length;
        System.out.println("Total Weekly Revenue: $" + totalRevenue);
        System.out.println("Average Daily Revenue: $" + String.format("%.2f", averageRevenue));
        System.out.println();

        // --- 2D Array: Room Occupancy (One Branch) ---
        System.out.println("=== Part 2: Room Occupancy (One Branch) ===");
        int[][] occupancy = new int[5][10]; // 5 floors, 10 rooms

        for (int floor = 0; floor < 5; floor++) {
            int occupiedCount = 0;
            for (int room = 0; room < 10; room++) {
                // Randomly assign 0 (vacant) or 1 (occupied)
                occupancy[floor][room] = random.nextInt(2);
                if (occupancy[floor][room] == 1) {
                    occupiedCount++;
                }
            }
            System.out.println("Floor " + (floor + 1) + ": Occupied = " + occupiedCount + ", Vacant = " + (10 - occupiedCount));
        }
        System.out.println();

        // --- 3D Array: Multiple Branches ---
        System.out.println("=== Part 3: Multiple Branches ===");
        // Dimensions: [Branch][Floor][Room]
        int[][][] chain = new int[3][5][10]; 
        int totalOccupiedAcrossChain = 0;

        for (int branch = 0; branch < 3; branch++) {
            for (int floor = 0; floor < 5; floor++) {
                for (int room = 0; room < 10; room++) {
                    chain[branch][floor][room] = random.nextInt(2);
                    if (chain[branch][floor][room] == 1) {
                        totalOccupiedAcrossChain++;
                    }
                }
            }
        }

        System.out.println("Total occupied rooms across all 3 branches: " + totalOccupiedAcrossChain);
        
        scanner.close();
    }
}