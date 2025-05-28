package arrays;

public class PrintSubArrays {
    private static void printSubArrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                System.out.print("[");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]);
                    if (k < end) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        printSubArrays(arr);
    }
}
