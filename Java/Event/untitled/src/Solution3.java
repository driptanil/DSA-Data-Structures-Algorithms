import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int query = input.nextInt();
        int queries[] = new int[query];
        for (int i = 0; i < query; i++) {
            queries[i] = input.nextInt();
        }
        for (int i = 0; i < queries.length; i++) {
            arr = extend(arr, shift(Arrays.copyOf(arr, arr.length), queries[i]));
            System.out.println(isPalin(arr));
        }

    }

    static String isPalin(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return "No";
            }
        }
        return "Yes";
    }

    static int[] shift(int[] arr, int x) {
        if (x < 0) {
            return rightShift(arr, -x);
        }
        return leftShift(arr, x);
    }

    static int[] rightShift(int[] arr, int x) {
        for (int j = 0; j < x; j++) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
        return arr;
    }

    static int[] leftShift(int[] arr, int x) {
        for (int j = 0; j < x; j++) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
        }
        return arr;
    }

    static int[] extend(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[i - arr1.length];
        }
        return arr3;
    }
}
