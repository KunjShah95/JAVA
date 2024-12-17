
import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            System.out.println("The sum of digits is: " + sum);
        }
    }
}
