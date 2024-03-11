// TODO-6: Write a C Program to find power of a given number using recursion.
#include <stdio.h>
int power(int, int);

int main()
{
    int n, p, r;
    printf("Enter the base no.: ");
    scanf("%d", &n);
    printf("Enter the exponent: ");
    scanf("%d", &p);

    r = power(n, p);
    printf("%d^%d is %d\n", n, p, r);
    return 0;
}
int power(int n, int p)
{
    if (p >= 1)
        return n * power(n, p - 1);
    return 1;
}