// 3. Develop a C program to add two operands and store the result in one of the operand using
// addition assignment operator.
#include <stdio.h>
int main()
{
    float x, y;
    printf("Enter two numbers: ");
    scanf("%f%f", &x, &y);                           // taking two inputs
    y += x;                                          // adding x and y and storing in y
    printf("The result of summation is: %.3f\n", y); // %.3f represents the no. of digits to be printed after decimal point.
    // printf("%.3f+%.3f=%.3f\n", x, y, x + y);
    return 0;
}