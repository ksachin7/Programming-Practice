// TODO write a c-program to find the smallest number among Three Numbers (integer values) using Nested if-else statement.
#include <stdio.h>
int main()
{
    int x, y, z; // declared variables
    printf("Enter three integers: ");
    scanf("%d %d %d", &x, &y, &z); // took inputs from user

    // First checking if x<y? and if yes then x<z? if yes then x would be the smallest otherwise z.
    if (x < y)
    {
        if (x < z)
            printf("%d is the smallest number.", x);
        else
            printf("%d is the smallest number: ", z);
    }
    // If first condition isn't true means y<x then checking if y<z if yes then y would be the smallest
    // otherwise goes to else statement and will print z is the smallest.
    else if (y < z)
        printf("%d is the smallest number.", y);
    else
        printf("%d is the smallest number.", z);

    return 0;
}
