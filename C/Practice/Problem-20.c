// TODO Write a C program to find power of a number using while loops. The base number (>0) and exponent (>=0) is taken from the test cases.
#include <stdio.h>
#include <stdlib.h>
int main()
{
    int base, exp, result = 1; // declaring base and exp and initializing result variable

    printf("Enter base number: ");
    scanf("%d", &base);
    if (base == 0) // if user will input 0 then will print The base value can't be zero! and program will exit.
    {
        printf("The base value can't be zero!\n");
        exit(0); // The library function void exit(int status) terminates the calling process immediately.
    }

    printf("Enter exponent: ");
    scanf("%d", &exp); // will take exponent from user

    // multipling result * base until exp=1, exp will become 0 and loop will stop executing.
    // This way I'm calculating base * base * base... until the loop goes.
    while (exp != 0)
    {
        result *= base;
        exp -= 1;
    }
    printf("%d \n", result);

    return 0;
}