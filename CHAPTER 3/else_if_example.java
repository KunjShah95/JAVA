public class else_if_example {
    public static void main(String[] args) {
        int number = 0;
        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
    }
}