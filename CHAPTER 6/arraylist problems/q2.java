// wap to sort an arraylist of strings in descending order and a single string in descending order

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class q2 {

    public static void sort(ArrayList<String> list) {
        Collections.sort(list, Collections.reverseOrder());
    }

    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new StringBuilder(new String(charArray)).reverse().toString();
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("Original list: " + list);
        sort(list);
        System.out.println("Sorted list: " + list);

        String str = "HELLO GOOD MORNING SAM";
        System.out.println("Original string: " + str);
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = sortString(words[i]);
        }
        for (String word : words) {
            System.out.println("Sorted word: " + word);
        }
    }
}
