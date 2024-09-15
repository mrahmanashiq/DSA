package sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted.
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

/*
 Bubble Sort Algorithm:
 1. Compare the first two elements of the array.
 2. If the first element is greater than the second element, swap them.
 3. Move to the next element and repeat step 2.
 4. Continue this process until the last element.
 5. Repeat steps 1-4 until the array is sorted.

 Time Complexity:
 Best Case: O(n)
 Average Case: O(n^2)
 Worst Case: O(n^2)
 */
