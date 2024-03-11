// Write a program that asks the user to enter a value for x and then displays the value of the following polynomial:
// 6𝑥5 + 5𝑥4 − 4𝑥3 + 3𝑥2 + 2𝑥 + 1
// Have to use: gcc filename.c -lm  in linux for compile

#include <stdio.h>
#include <math.h>

int main()
{
    int x, p;

    printf("Enter the value of x: ");
    scanf("%d", &x);

    // p = ((6 * x * x * x * x * x) + (5 * x * x * x * x) - (4 * x * x * x) + (3 * x * x) + (2 * x) + 1);
    // p = pow(x, 3);
    p = ((6 * pow(x, 5)) + (5 * pow(x, 4)) - (4 * pow(x, 3)) + (3 * pow(x, 2)) + (2 * x) + 1);

    printf("\nValue of the polynomial is: %d\n", p);
    return 0;
}
