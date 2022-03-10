# Cyclic Sort
Cycle Sort is only applicable for arrays containing a range of elements.

![](image1.png)

-   Space Complexity : O(1)
-   Time Complexity :
    -   Best Case : O(n)
    -   Worst Case : O(n)

	```java
	package com.inclass;
	
	import java.util.Arrays;
	
	public class CycleSortAlgorithm {
	    public static void main(String[] args) {
	        int[] arr = {3, 5, 2, 1, 4};
	        cycleSort(arr);
	        System.out.println(Arrays.toString(arr));
	    }
	
	    static void cycleSort(int[] arr) {
	        int index = 0;
	        while(index < arr.length) {
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
	}
	```

![[14-recursion]]