#include <stdio.h>
#include <math.h>
int main()
{
    int a=3,b=4;
    a=b+a;
    b=a-b;
    a=a-b;
    printf("%d %d",a,b);
}