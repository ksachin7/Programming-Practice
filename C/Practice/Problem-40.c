//! TODO-12 Write a C program to read Two One Dimensional Arrays of same data type (integer type) and merge them into
// another One Dimensional Array of same type. First take n as size of first array, then input all n elements of first array.
#include <stdio.h>
int main()
{
    int n, m, o;

    // first array
    printf("Enter array-1 size: ");
    scanf("%d", &n);
    int arr1[n];
    printf("%lu size of arr1: ", sizeof arr1);

    printf("\nEnter elements of the array-1: ");
    for (int i = 0; i < n; i++)
        scanf("%d", &arr1[i]);

    // second array
    printf("\nEnter array-2 size: ");
    scanf("%d", &m);
    int arr2[m];

    printf("\nEnter elements of the array-2: ");
    for (int i = 0; i < m; i++)
        scanf("%d", &arr2[i]);

    // making final array size equal to sum of size of both array.
    o = n + m;
    int arr3[o];
    // printf("Size of arr1: %lu\n", sizeof arr1);
    // printf("Size of arr2: %lu\n", sizeof arr2);
    // printf("Size of arr3: %lu\n", sizeof arr3);

    // adding first array elements to arr3
    for (int i = 0; i < n; i++)
    {
        arr3[i] = arr1[i];
    }

    // adding second array elements to arr3
    for (int i = 0, j = n; j < o && i < m; i++, j++)
    {
        arr3[j] = arr2[i];
    }

    // printing the final array
    printf("\nThe sum of both arrays arr3[%d]: ", o);
    for (int i = 0; i < o; i++)
    {
        printf("%d\t", arr3[i]);
    }
    printf("\n");

    return 0;
}

//? second way:

// #include <stdio.h>
// int main()
// {
//     int n, m, o;

//     int i, j;
//     printf("Enter 1st array size: ");
//     scanf("%d", &n);
//     int arr1[n];

//     printf("Enter 2nd array size: ");
//     scanf("%d", &m);
//     int arr2[m];

//     printf("%lu size of arr1: ", sizeof arr1);
//     int x = n + m;
//     int merge[x];

//     // first array

//     printf("Enter Array1 Elements: ");
//     for (i = 0; i < n; i++)
//     {
//         scanf("%d", &arr1[i]);
//         merge[i] = arr1[i];
//     }

//     printf("size of merge: %lu", sizeof merge);

//     // second array

//     printf("\nEnter Array2 Elements: ");
//     for (i = 0; i < m; i++)
//     {
//         scanf("%d", &arr2[i]);
//         merge[n] = arr2[i];
//         n++;
//     }
//     printf("%lu size of merge: ", sizeof merge);

//     // array1 and array2 merge
//     printf("\nArray3 after merge: ");
//     for (j = 0; j < n; j++)
//     {
//         printf("%d ", merge[j]);
//     }
//     printf("\n");
//     printf("\n%lu size of merge: ", sizeof merge);

//     return 0;
// }
