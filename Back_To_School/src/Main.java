import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 3;

        String str = sc.nextLine();
        System.out.println(str);
        System.out.println(str.charAt(5));

        System.out.println(arr);
    }
}