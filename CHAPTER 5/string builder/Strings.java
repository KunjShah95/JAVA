
public class Strings {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));
        // srt char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        // insert at index 0 
        sb.insert(0, "Hello");
        System.out.println(sb);
        // delete at index 0
        sb.delete(0, 5);
        System.out.println(sb);
        // delete char at index 0
        sb.deleteCharAt(0);
        System.out.println(sb);
        // reverse the string
        sb.reverse();
        System.out.println(sb);
        // replace char at index 0
        sb.replace(0, 5, "Hello");
        System.out.println(sb);
        // get the length of the string
        System.out.println(sb.length());
        // get the capacity of the string
        System.out.println(sb.capacity());
        // set the length of the string
        sb.setLength(5);
        System.out.println(sb);
        // get the substring
        System.out.println(sb.substring(0, 5));
        // get the index of a string
        System.out.println(sb.indexOf("Hello"));
        // get the last index of a string
        System.out.println(sb.lastIndexOf("Hello"));
        // get the string
        System.out.println(sb.toString());

    }
}
