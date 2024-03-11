// TODO-14 C Program to delete an element from a specified location of an Array starting from array [0] as
// the 1st position, array[1] as second position and so on. First take n as size of first array, then
// input all n elements of first array. Now input index value from user, print the array after deleting that index value from array.
#include <stdio.h>
int main()
{
    int n, pos;
    printf("Enter the size of array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter the elements of the array: \n");
    for (int i = 0; i < n; i++)
    {
        printf("arr[%d]= ", i);
        scanf("%d", &arr[i]);
    }

    // take the element to delete
    printf("Enter the element position to delete: ");
    scanf("%d", &pos);

    // delete the element
    if (pos < 0 || pos > n)
    {
        printf("Deletion isn't possible!");
    }
    else
    {
        for (int i = pos - 1; i < n - 1; i++)
            arr[i] = arr[i + 1];
        // n--;

        printf("Array after deliting the element arr[%d]: [\t", n);
        for (int i = 0; i < n; i++)
        {
            printf("%d\t", arr[i]);
        }
        printf("]\n");
    }

    return 0;
}