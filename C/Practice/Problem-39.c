// TODO-11 Write a C Program to print the array 5 10 20 30 40 50 elements in reverse order (Not reverse sorted order.
// Just the last element will become first element, second last element will become second element and so on)
#include <stdio.h>
int main()
{
    int n, arr[n];

    printf("Enter array size: ");
    scanf("%d", &n);

    printf("Enter elements of the array: ");
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    for (int i = n - 1; i >= 0; i--)
    {
        printf("%d ", arr[i]);
        n--;
    }

    return 0;
}
