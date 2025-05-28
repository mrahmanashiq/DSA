package arrays;

import java.util.*;

public class ArrayCC {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] numbers = {3, 4, 5};

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("numbers = " + Arrays.toString(numbers));
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }
}