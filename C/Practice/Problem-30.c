// TODO-3 Write a program in C to find whether a number n is prime number or not
#include <stdio.h>
int main()
{
    int num, flag = 0;
    printf("Enter a number: ");
    scanf("%d", &num);

    for (int i = 2; i <= num / 2; i++)
    {
        if (num % i == 0)
        {
            flag = 1;
            break;
        }
    }
    flag == 0 ? printf("%d is a prime number.", num) : printf("%d isn't a prime number.", num);
    return 0;
}