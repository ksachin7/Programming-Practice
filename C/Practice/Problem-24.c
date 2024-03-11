// TODO Write a C program to find sum of following series where the value of n is taken as input: 1+1/2+1/3+1/4+1/5+.. 1/n
#include <stdio.h>
int main()
{
    int n;
    float result = 0;
    printf("Enter a number :");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        result += 1.0 / i;
    }
    printf("sum : %.2f", result);
    return 0;
}