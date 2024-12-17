
public class value {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Before change: x = " + x);
        change(x);
        System.out.println("After change: x = " + x);
    }

    public static void change(int x) {
        x = 10;
    }
}
// there is no pass by reference in java, only pass by value
