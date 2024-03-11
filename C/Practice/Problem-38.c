// TODO-10 Write a C Program to find Largest Element of an Integer Array.
#include <stdio.h>
int main()
{
    int n, arr[n], tmp;

    printf("Enter array size: ");
    scanf("%d", &n);

    printf("Enter elements of the array: ");
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    // sort the array
    for (int i = 0; i < n; ++i)
    {
        for (int j = i + 1; j < n; ++j)
        {
            if (arr[i] > arr[j])
            {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }

    // print the largest element
    printf("%d ", arr[n - 1]);

    return 0;
}