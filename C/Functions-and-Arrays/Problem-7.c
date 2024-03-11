// TODO-7 Write a C program to search a given element from a 1D array and display the position at which it is
// found by using linear search function. The index location starts from 1.
#include <stdio.h>
void findElement(int, int[], int);
int main()
{
    int size, num;
    printf("Enter size of the array: ");
    scanf("%d", &size);
    int arr[size];
    printf("Enter elements: ");
    for (int i = 0; i < size; i++)
        scanf("%d", &arr[i]);

    printf("Enter an element to search: ");
    scanf("%d", &num);

    findElement(size, arr, num);
    return 0;
}
// if same element will be present many times then it will give the last occurance of the element.
void findElement(int size, int arr[], int num)
{
    int result = -1;
    printf("\n");
    for (int i = 1; i <= size; i++)
    {
        if (arr[i] == num)
            result = i;
    }
    (result == -1) ? printf("%d is not present in the array.\n", num) : printf("%d is present at location: %d\n", num, result);
    // if (result == -1)
    //     printf("%d is not present in the array.\n", num);
    // else
    //     printf("%d is present at location: %d\n", num, result);
}