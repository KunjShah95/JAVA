
import java.util.Scanner;

public class ZeroAndOneTriangle {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Prompt the user to enter the number of rows
            System.out.print("Enter the number of rows: ");
            int rows = input.nextInt(); // Read the number of rows from user input

            // Loop through each row
            for (int i = 0; i < rows; i++) {
                // Loop through each column in the current row
                for (int j = 0; j <= i; j++) {
                    // Print 1 if the sum of indices is even, otherwise print 0
                    if ((i + j) % 2 == 0) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
                // Move to the next line after each row
                System.out.println();
            }

        } // Close the scanner automatically
    }
}
