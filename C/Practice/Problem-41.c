// TODO-13 Write a C Program to delete duplicate elements from an array of integers.
// First take n as size of first array, then input all n elements of first array. Now delete duplicate elements from
// nested array. You can use nested loop for deleting duplicate elements.
#include <stdio.h>
int main()
{
    int n;
    printf("Enter the size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter the elements of the array: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    // delete duplicates
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (arr[i] == arr[j])
            {
                // delete the current position of the duplicate element
                for (int x = j; x < n - 1; x++)
                {
                    arr[x] = arr[x + 1];
                }

                // decreasing the size of array after removing duplicate element
                n--;

                // if the position of the elements is changes, don't increase the index j
                j--;
            }
        }
    }

    printf("Array without duplicate elements arr[%d]: ", n);
    for (int i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }
    printf("\n");
    return 0;
}
