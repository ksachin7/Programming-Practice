// TODO-4  Implement average function of two numbers as below:
// double average(double, double);
#include <stdio.h>
double average(double, double);
int main()
{
    double num1, num2;
    printf("Enter two numbers: ");
    scanf("%lf %lf", &num1, &num2);

    printf("average(%g, %g)= %.2f\n", num1, num2, average(num1, num2));
    return 0;
}
double average(double a, double b)
{
    double avg = 0;

    avg = (a + b) / 2;
    return avg;
}