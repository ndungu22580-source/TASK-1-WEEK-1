import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LibraryTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fileName = "borrowed_books.txt";

        System.out.println("--- Library Book Entry System ---");
        System.out.print("Enter the title of the book borrowed: ");
        String bookTitle = input.nextLine();

        // The 'true' parameter in FileWriter enables Append Mode
        try (FileWriter fw = new FileWriter(fileName, true);
             PrintWriter pw = new PrintWriter(fw)) {
            
            pw.println(bookTitle);
            
            // Confirmation message
            System.out.println("Success: '" + bookTitle + "' has been recorded in " + fileName);

        } catch (IOException e) {
            System.out.println("An error occurred while saving the title: " + e.getMessage());
        }

        input.close();
    }
}