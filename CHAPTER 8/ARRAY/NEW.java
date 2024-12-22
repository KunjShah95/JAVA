
public class NEW {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
// Deleting an element from an array is not directly supported in Java.
// However, you can create a new array and copy the elements you want to keep.

        int deleteIndex = 2; // Example index to delete
        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != deleteIndex) {
                newArr[j++] = arr[i];
            }
        }

// Optionally, assign newArr back to arr if you want to update the original array
        arr = newArr;

// Print new array to verify deletion
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
