// TODO-5 Write a program to use exp function from math.h
#include <stdio.h>
#include <math.h>
int main()
{
    double num;
    printf("Enter a number: ");
    scanf("%lf", &num);

    printf("exp(%g)= %lf\n", num, exp(num));
    return 0;
}
