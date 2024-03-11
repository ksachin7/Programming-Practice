// TODO-1 Write a C program to calculate power a given number using pow(a,b) function in math.h
#include <stdio.h>
#include <math.h>
int main()
{
    float base, exponent;
    printf("Enter the base number: ");
    scanf("%f", &base);
    printf("Enter the exponent: ");
    scanf("%f", &exponent);

    printf("pow(%g, %g)= %f\n", base, exponent, pow(base, exponent));
    return 0;
}