
// import java.util.Scanner;
// public class starpyramid {
//     public static void main(String[] args) {
//         int n;
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.print("Enter the number of rows: ");
//             n = sc.nextInt();
//         }
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// anotehr method
import java.util.Scanner;

public class starpyramid {

    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            n = sc.nextInt();
        }
        int nst = 1;
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            System.out.println();
            nst += 2;
            nsp--;
        }
    }
}