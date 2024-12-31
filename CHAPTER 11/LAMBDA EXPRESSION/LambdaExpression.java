
public class LambdaExpression {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello, World!");
            }
        }); // Lambda expression 

        t1.start();
    }
}
