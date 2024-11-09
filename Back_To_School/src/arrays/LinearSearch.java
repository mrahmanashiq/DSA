package arrays;

public class LinearSearch {
    public static int linearSearch(int[] number, int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int findDepartment(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 23, 9, 0, 1, 8, 3, 5};
        String[] departments = {"CSE", "SWE", "EEE", "CIVIL", "MECHANICAL"};
        int departmentIdx = findDepartment(departments, "civil");
        int index = linearSearch(arr, 0);

        System.out.println(index);
        System.out.println(departmentIdx);
    }
}
