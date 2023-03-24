import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * <h1>Bubble Sort</h1>
     * @param arr
     */
    static void bubbleSort(int[] arr) {
        int count = arr.length - 1;
        int check = 0;
        while (count > 0) {
            boolean sorted = false;
            for (int i = 0; i < count; i++) {
                check++;
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = true;
                }
            }
            if (!sorted) {
                break;
            }
            count--;
        }
        System.out.println(check);
    }

    /**
     * <h1>Maximum Selection Sort</h1>
     * @param arr
     */
    static void maxSelectionSort(int[] arr) {
        int count = arr.length - 1;
        while (count > 0) {
            int maxIndex = 0;
            for (int i = 1; i <= count; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            if (count != maxIndex) {
                int temp = arr[count];
                arr[count] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
            System.out.println(Arrays.toString(arr));
            count--;
        }
    }

    /**
     * <h1>Minimum Selection Sort</h1>
     * @param arr
     */
    static void minSelectionSort(int[] arr) {
        int count = 0;
        while (count < arr.length - 1) {
            int minIndex = count;
            for (int i = count + 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            if (count != minIndex) {
                int temp = arr[count];
                arr[count] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.println(Arrays.toString(arr));
            count++;
        }
    }

    /**
     * <h1>Insertion Sort</h1>
     * @param arr
     */
    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(Arrays.toString(arr));
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    /**
     * <h1>Cycle Sort</h1>
     * It is only applicable for arrays containing a range of elements.
     * @param arr
     */
    static void cycleSort(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] != arr[arr[index] - 1]) {
                System.out.println(Arrays.toString(arr));
                int temp = arr[index];
                arr[index] = arr[arr[index] - 1];
                arr[temp - 1] = temp;
            } else {
                index++;
            }
        }
    }

    /**
     * <h1>Merge Sort</h1>
     * @param arr
     * @return
     */
    static int[] mergeSort (int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge (int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[i + j] = left[i];
                i++;
            } else {
                mix[i + j] = right[j];
                j++;
            }
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < left.length) {
            mix[i + j] = left[i];
            i++;
        }

        while (j < right.length) {
            mix[i + j] = right[j];
            j++;
        }

        return mix;
    }

    /**
     * <h1>Inplace Merge Sort</h1>
     * @param arr
     * @param start
     * @param end
     */
    static void inplaceMergeSort (int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start + 1) / 2;
        inplaceMergeSort(arr, start, mid - 1);
        inplaceMergeSort(arr, mid, end);
        inplaceMerge(arr, start, end);
    }

    static void inplaceMerge (int[] arr, int start, int end) {
        int mid = start + (end - start + 1) / 2;
        while (start < mid && mid <= end) {
            if (arr[start] > arr[mid]) {
                for (int i = mid - 1; i >= start; i--) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
                start++;
                mid++;
            } else {
                start++;
            }
        }
    }

    /**
     * <h1>End Pivot Quick Sort</h1>
     * @param arr
     * @param start
     * @param end
     */
    static void endPivot (int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        print(arr, start, end);
        int startTemp = start;
        int pivot = end;
        while (start < pivot) {
            if (arr[start] > arr[pivot]) {
                int temp = arr[start];
                for (int i = start; i < pivot; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[pivot--] = temp;
            } else {
                start++;
            }
        }
        endPivot(arr, startTemp, pivot - 1);
        endPivot(arr, pivot, end);
    }


    /**
     * <h1>Start Pivot Quick Sort</h1>
     * @param arr
     * @param start
     * @param end
     */
    static void startPivot (int[] arr ,int start, int end) {
        if (start >= end) {
            return;
        }
        print(arr, start, end);
        int endTemp = end;
        int pivot = start;
        while (end > pivot) {
            if (arr[end] < arr[pivot]) {
                int temp = arr[end];
                for (int i = end - 1; i >= pivot; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[pivot++] = temp;
            } else {
                end--;
            }
        }
        startPivot(arr, start, pivot);
        startPivot(arr, pivot + 1, endTemp);
    }

    /**
     * <h1>Middle Pivot Quick Sort</h1>
     * @param arr
     * @param start
     * @param end
     */
    static void midPivot (int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int startTemp = start;
        int endTemp = end;
        int pivot = start + (end - start + 1) / 2;
        while (start < pivot) {
            if (arr[start] > arr[pivot]) {
                int temp = arr[start];
                for (int i = start; i < pivot; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[pivot--] = temp;
            } else {
                start++;
            }
        }
        print(arr, startTemp, endTemp);
        while (end > pivot) {
            if (arr[end] < arr[pivot]) {
                int temp = arr[end];
                for (int i = end - 1; i >= pivot; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[pivot++] = temp;
            } else {
                end--;
            }
        }
        print(arr, startTemp, endTemp);
        midPivot(arr, startTemp, pivot - 1);
        midPivot(arr, pivot, endTemp);
    }

    static void print (int[] arr, int start, int end) {
        System.out.print("[");
        for (int i = start; i < end; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[end] + "]");
    }
}