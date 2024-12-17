
import java.util.Scanner;

public class evennumbertriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = input.nextInt();

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((2 * j) + " ");
            }
            System.out.println();
        }
    }
}
