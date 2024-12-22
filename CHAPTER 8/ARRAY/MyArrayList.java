
import java.util.Scanner;

public class MyArrayList {

    public static void main(String[] args) {
        //synatx
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>(10);
        try ( // list.add(10);
                // list.add(20);
                // list.add(30);
                // list.add(40);
                // list.add(50);
                // System.out.println(list.contains(50));
                // System.out.println(list);
                Scanner input = new Scanner(System.in)) {
            System.out.println("Enter 5 numbers: ");
            for (int i = 0; i < 5; i++) {
                int num = input.nextInt();
                list.add(num);
            }
            System.out.println(list.contains(50));
            System.out.println(list);
        }
    }
}
