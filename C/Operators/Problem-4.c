// 4. Write a C program to find the maximum of 2 numbers using Conditional operator.
#include <stdio.h>
int main()
{
    float x, y, max; // declare three variables as float type.

    printf("Enter two numbers: ");
    scanf("%f%f", &x, &y);

    max = (x > y) ? x : y; // To find max i used comparision operator to check wheather x is greater than y.
    printf("%f", max);     // printed the maximum of the two.

    return 0;
}