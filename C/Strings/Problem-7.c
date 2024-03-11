// TODO-7:  Write a C Program to print Binary Equivalent of an Integer using Recursion.
#include <stdio.h>
#include <stdlib.h>
void decToBin(int);
int main()
{
    int n;
    printf("Enter a integer number: ");
    scanf("%d", &n);

    decToBin(n);
    printf("\n");
    return 0;
}
void decToBin(int n)
{
    printf("n before: %d\n", n);
    if (n == 0)
        return;
    decToBin(n / 2);
    printf("n: %d\n", n);
    printf("%d", n % 2);
}

// second method:
#include <stdio.h>
int decimalToBinary(int);
int main()
{
    int n;
    printf("Enter the base no.: ");
    scanf("%d", &n);

    printf("%d\n", decimalToBinary(n));

    return 0;
}
int decimalToBinary(int n)
{
    if (n == 0)
        return 0;
    return (n % 2) + 10 * decimalToBinary(n / 2);
}
// 11%2 +10 *decimalToBinary(11/2)
// 1+10*decimalToBinary(5)
// 1+10*(5%2+10*decimalToBinary(5/2)
// 1+10*(1+10*decimalToBinary(2))
// 1+10*(1+10*(0+10*decimalToBinary(1)))
// 1+10*(1+10)(0+10)*(1+10*0)
// 11*11*10*2