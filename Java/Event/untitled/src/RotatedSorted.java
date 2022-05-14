

public class RotatedSorted {
    public static void main(String[]  args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        System.out.println(binary(arr, target));
    }

    static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                if (arr[start] < arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if (target > arr[mid]) {
                if (arr[start] < arr[end]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                return mid;
            }
        }
        return -1;
    }
}
