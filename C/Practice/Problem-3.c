// Write a program to calculate volume of a sphere with 10-meter radius, using the formula 𝑣 = 4/3𝜋𝑟3.
// Write the fraction 4/3 as 4.0f/3.0f (Also Try writing 4/3 and see what happens?).
// Use variable name for 𝜋 as PI and store value as 22.0f/7.0f. Modify same program and prompt the user to enter the radius.

#include <stdio.h>

int main()
{
    float r;
    // r = 10;
    float v1, v2;
    float PI = 22.0f / 7.0f;

    printf("Enter the radius of the sphere: ");
    scanf("%f", &r);

    v1 = 4 / 3 * PI * r * r * r;
    v2 = 4.0f / 3.0f * PI * r * r * r;

    printf("\nVolume of the sphere is: %lf when using 4/3 and %lf when using 4.0f / 3.0f\n", v1, v2);
    return 0;
}