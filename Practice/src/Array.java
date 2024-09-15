import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[2] = 4;

        int[] dummy = {2, 3, 4};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(dummy));

        for(int i: arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println();
            }
            System.out.print(i + " ");
        }
    }
}
