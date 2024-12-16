public class bitwise {
    public static void main(String[] args) {
        int a = 5; // 101
        int b = 7; // 111
        System.out.println(a & b); // 101
        System.out.println(a | b); // 111
        System.out.println(a ^ b); // 010
        System.out.println(~a); // 11111111111111111111111111111010
        System.out.println(a << 1); // 1010
        System.out.println(a >> 1); // 10
        System.out.println(a >>> 1); // 10
    }
}
