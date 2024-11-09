package arrays;

public class LargestInArray {
    public static int findLargestValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 23, 9, 0, 1, 8, 3, 5};

        int largestNumber = findLargestValue(arr);
        System.out.println(largestNumber);
    }
}
