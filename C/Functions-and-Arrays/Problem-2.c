// TODO-2 Write a program and implement a function to find if it is leap year or not.
#include <stdio.h>
void is_leap(int);
int main()
{
    int year;
    printf("Enter a year: ");
    scanf("%d", &year);

    is_leap(year);
    return 0;
}

void is_leap(int year)
{
    int flag = 0;

    if (year % 4 == 0) // general leap year condition
    {
        if (year % 100 != 0) // checking if its a century if not then only general condition will apply
            flag = 1;
        else if (year % 100 == 0 && year % 400 == 0) // necessary condition for a century
            flag = 1;
        else
            flag = 0;
    }
    if (flag == 1)
        printf("%d is a leap year.\n", year);
    else
        printf("%d isn't a leap year.\n", year);
}