// ToDo-2. Write a program to swap two numbers
#include <stdio.h>
void swap(int, int);
int main()
{
    int x, y;
    printf("Enter x and y two integer value: ");
    scanf("%d%d", &x, &y);
    // printf("multiplicand= %d and multiplier= %d", m, n);

    swap(x, y);
    return 0;
}
void swap(int num1, int num2)
{
    printf("(%d , %d) after swapping: ", num1, num2);
    int tmp = 0;
    tmp = num1;
    num1 = num2;
    num2 = tmp;
    printf("(%d , %d)", num1, num2);
}