import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int size = 0;
        int ans[] = new int[x];
        for (int k = 0; k < x; k++) {
            size = input.nextInt();
            if (size <= 0) {
                System.out.println("none");
                break;
            }
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    if (proSum(Arrays.copyOfRange(arr, i, j + 1))) {
                        ans[k]++;
                    }
                }
            }
        }
        if (size > 0) {
            for (int i = 0; i < x; i++) {
                System.out.println(ans[i]);
            }
        }
    }

    static boolean proSum(int[] arr) {
        int pro = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            pro *= arr[i];
        }
        return pro == sum;
    }
}
