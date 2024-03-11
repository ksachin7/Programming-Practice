// TODO Write a C program to check whether a given number (n) is a perfect number or not? (Perfect Number -
// A perfect number is a positive integer number which is equals to the sum of its proper positive divisors.
// For example 6 is a perfect number because its proper divisors are 1, 2, 3 and it’s sum is equals to 6.)
#include <stdio.h>
int main()
{
    int n, sum = 0, i = 1;
    printf("Enter a number: ");
    scanf("%d", &n);
    while (i < n)
    {
        if (n % i == 0)
        {
            sum += i;
        }
        i++;
    }
    if (sum == n)
        printf("%d %dis a perfect number", sum, n);
    else
        printf("%d %d isn't a perfect number", sum, n);

    return 0;
}