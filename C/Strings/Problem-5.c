// TODO-5:  Write a program to check if a given integer is Prime Number using function
#include <stdio.h>
void checkPrime(int);
int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    checkPrime(n);
    // printf("%d\n", flag);
    return 0;
}
void checkPrime(int n)
{
    int flag = 0, result;
    for (int i = 2; i <= n / 2; i++)
    {
        if (n % i == 0)
        {
            // printf("n/i: %d/%d\n", n, i);
            flag = 0;
            break;
            // printf("n after break: %d\n", n);
        }
        else
        {
            flag = 1;
            // printf("n/i in else: %d/%d\n", n, i);
        }
    }
    // printf("flag: %d\n", flag);
    (flag == 1) ? printf("%d is a prime number.", n) : printf("%d is NOT a prime number.", n);
    // return result;
}
