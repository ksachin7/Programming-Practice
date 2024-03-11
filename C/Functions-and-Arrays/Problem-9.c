// TODO-9 Write a C program to reverse an array by swapping the elements and without using any new array.
#include <stdio.h>
void swap(int, int[]);
int main()
{
    int size;
    printf("Enter size of the array: ");
    scanf("%d", &size);
    int arr[size];
    printf("Enter elements: ");
    for (int i = 0; i < size; i++)
        scanf("%d", &arr[i]);
    swap(size, arr);
    return 0;
}
void swap(int size, int arr[])
{
    int tmp;
    for (int i = 0, j = size - 1; i < size / 2 && j >= 0; i++, j--)
    {
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    printf("\nReversed array: [\t");
    for (int i = 0; i < size; i++)
    {
        printf("%d\t", arr[i]);
    }
    printf("]\n\n");
}