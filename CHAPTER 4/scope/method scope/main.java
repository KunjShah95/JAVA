
public class main {

    public void display() {
        int x = 10; // Local variable
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        main obj = new main();
        obj.display();

        // System.out.println(x); // Error: x is not accessible here
    }
}


/* Variables declared inside a method are local variables, and their scope is limited to that method. They are created when the method is called and destroyed when the method finishes. */
