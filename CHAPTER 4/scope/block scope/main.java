
public class main {

    public static void main(String[] args) {
        int a = 5; // Accessible in the main method
        {
            int b = 10; // Block scoped variable
            System.out.println("Inside Block: a = " + a + ", b = " + b);
        }
        // System.out.println(b); // Error: b is not accessible outside the block
        System.out.println("Outside Block: a = " + a);
    }
}
// Variables declared within a block of code {} are only accessible inside that block.

