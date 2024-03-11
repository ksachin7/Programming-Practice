// TODO Write a c-program to calculate the sum of first and the Last Digit of a given Number. For example if the number is 1234 the result is 1+4=5.
#include <stdio.h>
int main()
{
    int n, sum = 0, first_digit, last_digit;
    printf("Enter number to find sum of first and last digit = ");
    scanf("%d", &n);
    // To find last digit of a number used modulo operator that gives remainder.
    last_digit = n % 10;
    // Find the first digit by dividing n by 10 until n greater then 10
    while (n >= 10)
    {
        n = n / 10; // while no > 10 keep dividing by 10. this way we get the first digit.
        // printf("%d\n", n);
    }
    first_digit = n;
    // Calculate sum of first and last digit
    sum = first_digit + last_digit;
    printf("Sum of first and last digit = %d\n", sum);
    // !note : if we take number as 01234 it will not consider 0 as first digit as it will 1234 as int
    // !note: if we initialize var with 0123 or anything starting with 0 it will be treated as octal value

    return 0;
}