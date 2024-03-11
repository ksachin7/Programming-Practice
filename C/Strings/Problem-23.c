// TODO-3. Write a recursive function to find the sum of n integers.
#include <stdio.h>
int sum = 0;
int adder(int, int[]);
int main()
{
    int size, add;
    printf("Enter number of elements to add: ");
    scanf("%d", &size);
    int numbers[size];

    printf("Enter numbers to add: ");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &numbers[i]);
    }

    add = adder(size, numbers);
    printf("The sum of all numbers= %d\n", add);
    return 0;
}
int adder(int size, int numbers[])
{
    if (size == 0)
        return sum;
    else
        sum += numbers[--size];
    return adder(size, numbers);
}