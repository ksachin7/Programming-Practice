// TODO-1 Write a Program to find if a given number is Armstrong number. Armstrong number has property: 153= 1^3 +5^3 +3^3
#include <stdio.h>
#include <math.h>
int main()
{
    int num, n = 0, tmp, remainder, result = 0;
    printf("Enter a number: ");
    scanf("%d", &num);
    tmp = num; // assigning entered number to tmp variable so the original num won't change.

    // calculating number of digits
    while (tmp != 0)
    {
        tmp /= 10;
        n++;
    }
    tmp = num;

    while (tmp != 0)
    {
        // calculate the last digit
        remainder = tmp % 10;
        // calculate the power of digit using pow function i.e included in math.h
        result += pow(remainder, n);
        // remove the last digit
        tmp /= 10;
        printf("result is %d\n", result);
    }
    result == num ? printf("%d is an Armstrong number.\n", num) : printf("%d isn't an Armstrong number.\n", num);

    return 0;
}