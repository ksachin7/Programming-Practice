// TODO-8 Write a C program to reverse an array by using another new array.
#include <stdio.h>
int main()
{
    int size;
    printf("Enter size of the array: ");
    scanf("%d", &size);
    int arr[size];
    printf("Enter elements: ");
    for (int i = 0; i < size; i++)
        scanf("%d", &arr[i]);
    int arr1[size];
    printf("\n[\t");
    for (int i = size - 1, j = 0; i >= 0 && j < size; i--, j++)
    {
        arr1[j] = arr[i];
        printf("%d\t", arr1[j]);
    }
    printf("]\n\n");
    return 0;
}