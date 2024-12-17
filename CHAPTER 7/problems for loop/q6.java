
import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the base (a): ");
            double base = scanner.nextDouble();

            System.out.print("Enter the exponent (b): ");
            double exponent = scanner.nextDouble();

            double result = Math.pow(base, exponent);
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }
    }
}
