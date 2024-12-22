
import java.util.ArrayList;

public class Reverse {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.contains(50));
        System.out.println(list);
        reverse(list);
        System.out.println(list.contains(50));
        System.out.println(list);
    }

    static void reverse(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
}
