package arrays;

import java.util.*;
import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int[] arr) {
        int firstIdx = 0;
        int lastIdx = arr.length - 1;
        while (firstIdx < lastIdx) {
            int temp = arr[firstIdx];
            arr[firstIdx] = arr[lastIdx];
            arr[lastIdx] = temp;
            firstIdx ++;
            lastIdx --;
        }
        return arr;
    }

    public static List<Integer> reversedList(List<Integer> list) {
        int firstIdx = 0, lastIdx = list.size() - 1;
        while (firstIdx < lastIdx) {
            Collections.swap(list, firstIdx, lastIdx);
            firstIdx ++;
            lastIdx --;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversedArray = reverseArray(arr);

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        List<Integer> reversedList = reversedList(list);

        System.out.println(Arrays.toString(reversedArray));
        System.out.println(reversedList);
    }
}
