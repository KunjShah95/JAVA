
import java.util.Scanner;

public class alphanumeric {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Taking the number of rows as input
            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();

            char letter; // Variable for alphabets

            for (int i = 1; i <= rows; i++) {
                if (i % 2 == 0) {
                    // Print alphabets for even rows
                    letter = 'A';
                    for (int j = 1; j <= i; j++) {
                        System.out.print(letter++ + "   ");
                    }
                } else {
                    // Print numbers for odd rows
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + "   ");
                    }
                }
                System.out.println(); // Move to next row
            }

        }
    }
}
