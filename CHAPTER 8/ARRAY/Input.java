
import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // first way to print array 
        //array of primitives
        // int[] arr = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }
// best way and method to print array
        // System.out.println(Arrays.toString(arr));
        //another way to print array
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // for (int num : arr) {  //for every element in array, print the element
        //     System.out.print(num + " "); //here num represnts element of array
        // }
        // System.out.println(arr[5]);  //index out of bound error
        //array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "hello";
        System.out.println(Arrays.toString(str));

    }
}
