import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        double attendance = input.nextDouble();

        System.out.print("Enter average marks: ");
        double marks = input.nextDouble();

        // Eligibility criteria: Attendance >= 75% AND Average marks >= 40
        if (attendance >= 75 && marks >= 40) {
            System.out.println("Eligible for final exams.");
        } else {
            System.out.println("Not eligible.");
        }

        input.close();
    }
}