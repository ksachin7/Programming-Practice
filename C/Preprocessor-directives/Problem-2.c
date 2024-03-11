// TODO-2. Using #define, declare a value, say PI = 3.14, and use it to calculate area of a circle, given the radius.
#include <stdio.h>
#define PI 3.14
int main()
{
    float r;
    printf("Enter the radius of the circle: ");
    scanf("%f", &r);
    printf("\nArea of the circle is: %f\n", PI * r * r); // var is defined in custom.h
    return 0;
}