// TODO-17 Write a C program to print lower triangle of a square matrix.
// Input size of square matrix as n. Solve of nxn square matrix
#include <stdio.h>
int main()
{
    int n;
    printf("Enter the size of squre matrix: ");
    scanf("%d", &n);

    int sqmt[n][n];
    // take elements of the matrix
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("sqmt[%d][%d]: ", i, j);
            scanf("%d", &sqmt[i][j]);
        }
    }

    // print the matrix
    printf("The squre matrix: \n");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ", sqmt[i][j]);
        }
        printf("\n");
    }

    // lower triangle matrix
    printf("Required lower triangle squre matrix: \n");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {

            (i >= j) ? printf("%3d ", sqmt[i][j]) : printf("%3d", 0);
        }
        printf("\n");
    }
    return 0;
}