# Bubble Sort

Bubble Sort is also called Sinking or Exchange Sort.

In every step, adjacent elements are compared and swapped.

![](/Java/08-bubble-sort/image1.png)

-   Space Complexity = O(1) [In-place Sorting Algorithm]
    
-   Time Complexity :
    
    -   Best Case : O(n)
    -   Worst Case : O(n^2)
    
-   In-place Sorting:
    -   A Sorting Algorithm which uses constant Space Complexity i.e. zero Auxiliary Space
-   Stable Sorting:
    -   A Sorting Algorithm without changing indexes of equal elements while sorting.


	```java
	package com.inclass;
	
	/*
	    Bubble sort is also known as Exchange or Sinking Sort.
	    Bubble sort is an inplace sorting algorithm
	*/
	
	import java.util.Arrays;
	
	public class BubbleSort {
	    
	    public static void main(String[] args) {
	        int[] arr = {5, 4, 3, 2, 1};
	        bubbleSort(arr);
	        System.out.println(Arrays.toString(arr));
	    }
	    
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
	}
	```

![[09-selection-sort]]
