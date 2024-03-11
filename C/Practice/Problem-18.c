// TODO Write a program to find the factorial of a given number using while loop 5! = 5*4*3*2*1 6! = 6*5*4*3*2*1 0!=1 1!=1 -5!=1 -10!=1
#include <stdio.h>
int main()
{
    int n, f = 1, i = 1; // declared n and initialized f and i as required for program
    printf("Enter a number: ");
    scanf("%d", &n); // took input from user

    // To find the factorial using while loop multipied f by i. as i<=n the loop will run n times and will do f*i
    while (i <= n)
    {
        f = f * i;
        i += 1; // incrementing i after each loop
    }
    printf("The factorial of %d is: %d\n", n, f); // printing the final factorial

    return 0;
}