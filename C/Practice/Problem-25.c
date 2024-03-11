// TODO Write a C program to print the following Pyramid pattern upto Nth row. Where N (number of rows to be printed) is taken as input.
#include <stdio.h>
int main()
{
    int n;
    // char pyramid[] = {};
    printf("Enter the value of N: ");
    scanf("%d", &n);
    while (n != 0)
    {
        for (int i = 0; i < n; i++)
        {
            printf("*");
        }
        printf("\n");
        n--;
    }
    return 0;
}