// TODO-3 Write a program and implement a factorial function using below prototype declarations:
// long int factorial(long int);
#include <stdio.h>
long int factorial(long int);
int main()
{
    long int num;
    printf("Enter a number: ");
    scanf("%ld", &num);

    printf("factorial(%ld)= %ld\n", num, factorial(num));
    return 0;
}
long int factorial(long int num)
{
    long int fact = 1;
    if (num == 0)
        fact = 1;
    else
    {
        for (int i = 1; i <= num; i++)
        {
            fact *= i;
        }
    }

    return fact;
}