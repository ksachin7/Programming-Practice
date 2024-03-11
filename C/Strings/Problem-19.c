// TODO-19 what will be the output of following code
#include <stdio.h>
void swap(int a, int b)
{
    int temp;
    temp = a;
    a = b;
    b = temp;
}
int main()
{
    int num1 = 10, num2 = 20;
    printf("Before swapping num1 = %d num2 = %d\n", num1, num2);
    swap(num1, num2);
    printf("After swapping num1 = %d num2 = %d\n", num1, num2);
    return 0;
}
// Output: Before swapping num1 = 10 num2 = 20
// After swapping num1 = 10 num2 = 20
// Explanation: Its printing the same because its a void function so it won't return anything. To make it work
// we have to put that after swapping printf statement inside the void swap() function and also we have to change
// the varibles num1 to a and num2 to b in that printf.
