// Write a program to calculate area and circumference of a circle using formula: 𝑎𝑟𝑒𝑎 = 𝜋𝑟2 and 𝑐𝑖𝑟𝑐𝑢𝑚𝑓𝑒𝑟𝑒𝑛𝑐𝑒 = 2𝜋r.
// Take the input r from the user.

#include <math.h>
#include <stdio.h>

int main()
{
    float r;
    double area, circumference;
    printf("Enter the radius of the circle: ");
    scanf("%f", &r);

    area = M_PI * r * r;
    circumference = 2 * M_PI * r;

    printf("\nArea of the circle is: %lf\n", area);
    printf("Circumference of the circle is: %lf\n", circumference);

    return 0;
}