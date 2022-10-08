#include<stdio.h>
int main()
{
    int i,x,n;
    printf("Enter the limit of elements : ");
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++)
    {
        printf("Enter %d element : ",i+1);
        scanf("%d",&a[i]);
    }
    printf("\nEnter the element to search: ");
    scanf("%d",&x);
    for(i=0;i<n;i++)
    {
        if(a[i]==x)
            break;
    }
    if(i<n)
        printf("Search element %d is found at index %d",x,i+1);
    else
        printf("Element not found ! %d isn't present in the list",x);
    return 0;
}
