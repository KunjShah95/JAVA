
import java.util.Scanner;

public class recursion {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of terms: ");
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print(fib(i) + " ");
            }
        }
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
