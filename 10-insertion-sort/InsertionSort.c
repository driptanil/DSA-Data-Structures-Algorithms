#include<stdio.h>
int main()
{
	int n;
	printf("Enter limit: ");
	scanf("%d",&n);
	int arr[10];
	int i,j,k,t=0;
	for(i=0;i<n;i++)
	{
		printf("arr[%d]",i);
		scanf("%d",&arr[i]);	
	}
	printf("Sorted elements: ");
	for(i=1;i<n;i++)
	{
		int c=arr[i];
		j=i-1;
		while(j>=0 && c<arr[j])
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=c;
	}
	printf("Enter weight of peoples: ");
	for(k=0;k<n;k++)
	{
			printf("%d ",arr[k]);
	}
	return 0;
}

