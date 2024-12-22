
// wap to sort an arraylist of strings in ascending order
import java.util.ArrayList;
import java.util.Collections;

public class q3 {

    public static void sort(ArrayList<String> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        list.add("a");
        list.add("c");
        list.add("b");
        list.add("k");
        list.add("d");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
