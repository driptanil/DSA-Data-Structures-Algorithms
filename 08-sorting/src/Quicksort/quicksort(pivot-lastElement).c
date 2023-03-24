#include <stdio.h>

void swap(int *x,int *y){
       int temp=*x;
       *x=*y;
       *y=temp;
}

int partition(int a[], int left, int right)
{
   swap(&a[left],&a[right]);//swap the first and last element
    int pivot = a[left];
    int i = left - 1;
    for (int j = left; j <= right; j++)
    {
        if (a[j] <= pivot)
        {
            i++;
            swap(&a[i], &a[j]);
        }
    }
    swap(&a[i],&a[left]);
    return i;
    
}

void quicksort(int a[], int left, int right)
{
    if (left < right)
    { 
        int j = partition(a, left, right);
        quicksort(a, left, j - 1);
        quicksort(a, j + 1, right);
    }
}

void printArray(int a[],int size){
     for(int i=0;i<size;i++)
     printf("%d ",a[i]);
}

int main()
{
    int a[10]={1,6,7,4,7,8,923,4,2,22};
    quicksort(a,0,9);
    printArray(a,10); 
    return 0;
}