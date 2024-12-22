
public class Min {

    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(min(arr));

    }

    private static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
