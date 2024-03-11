// TODO-18 How many times function factorial will be executed
#include <stdio.h>
int factorial(int);
int main()
{
    int n = 10;
    long int f;
    f = factorial(n);
    printf("%d!= %ld\n", n, f);
    return 0;
}
int count = 0;

int factorial(int n)
{
    // count++;
    // printf("%d", count);
    if (n == 0)
        return 1;
    else
        return (n * factorial(n - 1));
}
// Output: (10!= 3628800)
// Explanation: factorial executed 11-times (n=10 to 0).