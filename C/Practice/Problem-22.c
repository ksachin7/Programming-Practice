// TODO Write a C program to count total number of digits of an Integer number (n).
#include <stdio.h>
int main()
{
    int n, count = 0; // declared n and initialized count
    printf("Enter a number: ");
    scanf("%d", &n); // taking input from user

    // dividing by 10 and counting this way we can calculate no. of digits.
    while (n != 0)
    {
        n = n / 10;
        count++;
    }
    printf("%d\n", count); // printing the total count that will total no. of digits in the number.
    return 0;
}