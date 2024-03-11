// Write a C program to calculate volume of a box. A box can be represented by three quantities: length, width and height in inches.
// Volume can be calculated as: volume = height * length * width
// Take the input from user (using scanf) and print the volume as a result. Use float data types for all variables

#include <stdio.h>

int main()
{
    float length, height, width;
    double volume;
    printf("Enter the length of the box: ");
    scanf("%f", &length);
    printf("Enter the width of the box: ");
    scanf("%f", &width);
    printf("Enter the height of the box: ");
    scanf("%f", &height);
    volume = length * height * width;
    printf("The volume of the box is: %lf\n", volume);

    return 0;
}
