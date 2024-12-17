
public class main {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // 'a' and 'b' are actual parameters passed to the method
        displaySum(a, b);
    }

    static void displaySum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
