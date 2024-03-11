// TODO-1 Write a program Using recursion and addition operator to implement multiplication.
#include <stdio.h>
int multiplication(int, int);
int main()
{
    int m, n, product;
    printf("Enter multiplicand and multiplier: ");
    scanf("%d%d", &m, &n);
    // printf("multiplicand= %d and multiplier= %d", m, n);

    product = multiplication(m, n);
    printf("%d*%d= %d\n", m, n, product);
    return 0;
}
int multiplication(int m, int n)
{
    if (n == 1)
        return m;
    else
        return m + multiplication(m, n - 1);
}