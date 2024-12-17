
public class interning {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hello";
        String s4 = s3.intern();

        // true because s1 and s2 refer to the same object in the string pool
        System.out.println(s1.equals(s2));

        // false because s3 is a new object
        System.out.println(s1.equals(s3));

        // true because s4 is interned and refers to the same object as s1
        System.out.println(s1.equals(s4));
    }
}
