// Write a program to calculate simple interest using formula: 𝑠𝑖 = 𝑝𝑟𝑖𝑛𝑐𝑖𝑝𝑙𝑒 ∗ 𝑟𝑎𝑡𝑒 ∗ 𝑡𝑖𝑚𝑒. Take all variable as float type.

#include <stdio.h>

int main()
{
    float principle, rate, time, SI;
    printf("Enter Principle, rate and time respectively: ");
    scanf("%f %f %f", &principle, &rate, &time);

    SI = principle * rate * time;
    printf("\nSimple Interest is: %f\n", SI);
    return 0;
}
