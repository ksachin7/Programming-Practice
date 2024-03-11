// TODO: Write a C program to check if a given Number is zero or Positive or Negative Using if...else statement.
#include <stdio.h>
int main()
{
    float i;
    printf("Enter a number: ");
    scanf("%f", &i);
    if (i < 0)
        printf("The number is a negative number.\n");
    else if (i > 0)
        printf("The number is a positive number.\n");
    else
        printf("The number is Zero.\n");
    return 0;
}