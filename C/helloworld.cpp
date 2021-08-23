#include <stdio.h>
#include <math.h>
int main()
{
    int num,remainder,divisor=10000,multiplier=1,reverse=0;
    printf("Enter a 5 Digit number:");
    scanf("%d", &num);

    remainder=num%divisor;
    num=(num-remainder)/10;
    remainder=remainder*multiplier;
    multiplier=multiplier*10;
    divisor=divisor/10;
    reverse=reverse+remainder;
}