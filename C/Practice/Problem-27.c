// TODO Write a program to find the GCD (Greatest Common Divisor) of 2 (two) numbers using 'for' loop.
#include <stdio.h>
int main()
{
    int i = 1, x, y, gcd;
    printf("Enter two numbers: ");
    scanf("%d %d", &x, &y); // taking inputs from user

    // checking if any entered number is negative and if it is converted it to positive.
    x = x > 0 ? x : -x;
    y = y > 0 ? y : -y;

    // To find the GCD
    while (i <= x && i <= y)
    {
        if (x % i == 0 && y % i == 0) // checking which number divides both the number x and y
        {
            gcd = i;
            // assigning the divisor to gcd. the value will update after every loop if it finds another divisor.
        }
        i++;
    }
    printf("The Greatest common factor is: %d\n", gcd); // The value of gcd after loop ends will be the GCD.
    return 0;
}
