#include <stdio.h>
int main()
{
    int i, low, high, mid, n, key;
    printf("Enter the limit of elements : ");
    scanf("%d",&n);
    int array[n];
    for(i = 0; i < n; i++)
    {
        printf("Enter %d element : ",i+1);
        scanf("%d",&array[i]);
    }
    printf("Enter the element to search: ");
    scanf("%d", &key);
    low = 0;
    high = n - 1;
    while (low <= high) 
    {
        mid = (low + high)/2;
        if(array[mid] < key)
            low = mid + 1;
        else if (array[mid] == key) 
        {
            printf("Search element %d is found at location %d", key, mid+1);
            break;
        }
        else
        high = mid - 1;
    }
    if(low > high)
        printf("Element Not found! %d isn't present in the list.", key);
    return 0;
}
