// TODO-2 Write a program to find whether given number is palindrome or not. Palindrome number is a number which is same as its reverse
#include <stdio.h>
int main()
{
    int x, tmp, remainder, reverse = 0;
    printf("Enter a number: ");
    scanf("%d", &x);
    tmp = x;

    // find the reverse of a number
    while (tmp != 0)
    {
        // find the last digit
        remainder = tmp % 10;

        // finding the reverse
        reverse = reverse * 10 + remainder; // multiplying by 10 to shift its place by 1 unit

        // remove the last digit
        tmp /= 10;
    }

    // check if reverse == number
    reverse == x ? printf("%d is a palindrome", x) : printf("%d isn't a palindrome", x);
    return 0;
}