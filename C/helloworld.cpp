#include <stdio.h>
int main()
{
    int year;
    printf("According to the Gregorian calendar, it was Monday on the date 01/01/01");
    printf("\nEnter the year:");
    scanf("%d",&year);
    year=year-1;
    int leap_year=year/4-year/100+year/400;
    int rest_years=year-leap_year;
    int days=rest_years*365+leap_year*366;
    int day=days%7;
    year=year+1;
    if (day==0)
        printf("Its Monday on 01/01/%d",year);
    else if (day==1)
        printf("Its Tueday on 01/01/%d",year);
    else if (day==2)
        printf("Its Wednesday on 01/01/%d",year);
    else if (day==3)
        printf("Its Thurday on 01/01/%d",year);
    else if (day==4)
        printf("Its Friday on 01/01/%d",year);
    else if (day==5)
        printf("Its Saturday on 01/01/%d",year);
    else
        printf("Its Sunday on 01/01/%d",year);
    
}