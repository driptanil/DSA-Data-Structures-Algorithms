# Insertion Sort
Insertion Sort is sorting the array in parts.

![](/Java/10-insertion-sort/image1.png)

-   Space Complexity : O(1) [In-place Sorting Algorithm]
-   Time Complexity :
    -   Best Case : O(n)
    -   Worst Case : O(n^2)
-   Stable Sorting Algorithm
-   Use Case : When array is partially sorted.

```java
package com.inclass;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

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
}
```

