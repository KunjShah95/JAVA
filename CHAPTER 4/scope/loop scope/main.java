// Variables declared in a loop are accessible only within the loop body.

public class main {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        // System.out.println(i); // Error: i is not accessible outside the loop
    }
}
