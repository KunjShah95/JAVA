
import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args) {
        /*
         1 2 3
         4 5 6
         7 8 9        
         */
        // int[][] arr = new int[3][]; // rows is mandatory to define 

        // int[][] arr = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };
        // // Print the elements of the array
        // for (int[] arr1 : arr) {
        //     for (int j = 0; j < arr1.length; j++) {
        //         System.out.print(arr1[j] + " ");
        //     }
        int[][] arr = new int[3][3];
        // input
        try (Scanner in = new Scanner(System.in)) {
            for (int[] arr1 : arr) {
                for (int j = 0; j < arr1.length; j++) {
                    arr1[j] = in.nextInt();
                }
            }
            // output
            for (int[] arr1 : arr) {
                for (int col = 0; col < arr1.length; col++) {
                    System.out.print(arr1[col] + " ");
                }
                System.out.println();
            }
        }
    }
}
