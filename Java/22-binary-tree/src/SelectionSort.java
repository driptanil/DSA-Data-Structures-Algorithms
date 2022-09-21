public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3, -1, 5, 2, 4};
        SelectionSort sort = new SelectionSort();
        System.out.println(sort.min(arr));
    }

    public int min (int[] arr) {
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }
}
