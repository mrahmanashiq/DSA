package arrays;

import java.util.Arrays;

public class BasicArrayOperation {

    private static void insertInArray(int[] arr, int idx, int val) {
        // Shift elements to the right from the end to idx
        for (int i = arr.length - 1; i > idx; i--) {
            arr[i] = arr[i - 1];
        }
        // Insert the new value at idx
        arr[idx] = val;
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int idx = 2;
        int val = 9;

        insertInArray(arr, idx, val);
        System.out.println(Arrays.toString(arr));
    }
}
