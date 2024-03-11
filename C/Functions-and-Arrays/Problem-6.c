// TODO-6 Write a program to print all the locations at which a particular element (taken as input) is found in
// a array and also print the total number of times it occurs in the array. The location starts from 1.
#include <stdio.h>
unsigned int findElement(int, int[], int);
int main()
{
    int size, num;
    printf("Enter size of the array: ");
    scanf("%d", &size);
    int arr[size];
    printf("Enter elements: ");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Enter an element to find: ");
    scanf("%d", &num);

    printf("\n%d is present in the array %u times.\n", num, findElement(size, arr, num));
    return 0;
}
unsigned int findElement(int size, int arr[], int num)
{
    int count = 0;
    printf("\n");
    for (int i = 0; i < size; i++)
    {
        if (arr[i] == num)
        {
            printf("%d is present at location: %d\n", num, i);
            count++;
        }
    }
    if (count == 0)
    {
        printf("%d isn't present in the array.\n", num);
    }
    return count;
}