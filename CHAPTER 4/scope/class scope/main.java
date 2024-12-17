
public class main {

    int instanceVar = 20; // Instance variable
    static int staticVar = 50; // Static variable

    public void show() {
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        main obj = new main();
        obj.show();

        System.out.println("Accessing Static Variable directly: " + staticVar);
    }
}
/* Variables declared inside the class but outside any method have class-level scope.

Instance variables are accessed through objects.
Static variables belong to the class and are shared across all objects. */
