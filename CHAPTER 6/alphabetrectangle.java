
import java.util.Scanner;

public class alphabetrectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = input.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char) (65 + i) + " ");
            }
            System.out.println();
        }
    }
}
// Compare this snippet from CHAPTER%206/numberrectangle.java:
