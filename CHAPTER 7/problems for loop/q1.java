// count the number of digits for a given number n 

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of digits : ");
            int n = input.nextInt();
            int count = 0;
            while (n > 0) {
                n = n / 10;
                count++;
            }
            System.out.println("The number of digits is: " + count);
        }
    }
}
