#include <stdio.h>
#include <stdlib.h>
/*

------- SELECTION SORT -------

Algorithm:

Run Loop from n to 1:
    - Find Maximum Element and place it in maximum index
    - Decrease size of array

Time Complexity : N^2 (both for best and worst cases)

*/

int maximum(int arr[], int end) // Time Complexitity = n
{
    int max = 0; // 1, 5 ,2, 3
    for (int i = 1; i <= end; i++)
    {
        if (arr[i] > arr[max]) // 5 > 1
        {
            max = i; // max = index of 5
        }
    }
    return max;
}

void maxselectionSort(int arr[], int size) // Time Complexity 
{
    // size 5: 4, 3, 2, 1
    for (int i = size - 1; i > 0; i--) { // Complex = n
        int temp = maximum(arr, i); // complex = n
        
        // 1, 4, 3, 2, 5 maxIndex = 4, i = 4
        if (i != temp) { 
            int store = arr[temp];
            arr[temp] = arr[i];
            arr[i] = store;
        }
    }
}

int minimum(int arr[],int start,int size)
{
    int min =start;
    for(int i = start+1; i<size;i++){
        if(arr[i]<arr[min]){
            min = i;
        }
    }
    return min;
}

void minselectionSort(int arr[], int size) // Time Complexity 
{
    // size 5: 4, 3, 2, 1
    for (int i = 0; i < size-1; i++) { // Complex = n
        int temp = minimum(arr, i,size); // complex = n
        
        // 1, 4, 3, 2, 5 maxIndex = 4, i = 4
        if (i != temp) { 
            int store = arr[temp];
            arr[temp] = arr[i];
            arr[i] = store;
        }
    }
}

void show (int arr[] , int size) {
    printf("\n [");
    for(int i = 0; i < size - 1; i++) {
        printf("%d, ", arr[i]);
    }
    printf("%d]\n", arr[size - 1]);
}

int main()
{
    // int arr[] ={4, 5, 1, 2, 3};
    // int size = sizeof(arr) / sizeof(arr[0]);
    int size;
    printf("\nEnter size: ");
    scanf("%d", &size);
    int arr[size];
    
    for(int i = 0; i < size; i++) {
        printf("array[%d]: ", i);
        scanf("%d", &arr[i]);
    }
   // maxselectionSort(arr, size);
    minselectionSort(arr, size);
    show(arr, size);
    return 0;
}

