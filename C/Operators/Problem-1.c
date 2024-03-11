// 1. Develop a C program to perform operations (+,*,-, / and %) on two whole numbers.
// Identify suitable data types to represent the numbers and resultant values.
#include <stdio.h>
int main()
{
    int x, y; // took int data type for whole numbers.
    char op;

    printf("Enter a whole number then an operator then second whole number: ");
    scanf("%d %c %d", &x, &op, &y); // took three inputs x , y and op

    switch (op)
    {
    case '+':
        printf("%d + %d= %d\n", x, y, x + y);
        break;
    case '-':
        printf("%d - %d= %d\n", x, y, x - y);
        break;
    case '*':
        printf("%d * %d= %d\n", x, y, x * y);
        break;
    case '/':
        printf("%d / %d= %d\n", x, y, x / y);
        break;
    case '%':
        printf("%d %% %d= %d\n", x, y, x % y);
        break;
    default:
        printf("Somthing went wrong!");
        break;
    }
    return 0;
}