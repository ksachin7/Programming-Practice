// TODO-16 Write a C program to find subtraction of two matrices i.e. matrix_A - matrix_B=matrix_C.
// Input number of rows and number of cols from user for both A and B matrix. Now input all rows*cols values from user
#include <stdio.h>
int main()
{
    int row, col, diff[10][10], arr1[10][10], arr2[10][10];
    // matrix-1
    printf("Enter the order of matrix(row & column) separated by space: ");
    scanf("%d %d", &row, &col);

    // enter elements in matrix
    printf("Enter the elements of the matrix_1: \n");
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            printf("arr[%d][%d]: ", i, j);
            scanf("%d", &arr1[i][j]);
        }
    }

    // matrix-2
    // enter elements in matrix
    printf("Enter the elements of the matrix_2: \n");
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            printf("arr[%d][%d]: ", i, j);
            scanf("%d", &arr2[i][j]);
        }
    }

    // print matrices
    printf("\nThe matrix_1 is: \n");
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            printf("%3d ", arr1[i][j]);
        }
        printf("\n");
    }
    printf("\nThe matrix_2 is: \n");
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            printf("%3d ", arr2[i][j]);
        }
        printf("\n");
    }

    // print the difference of elements of the matrix
    printf("\nmatrix_1 - matrix_2: \n");
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            diff[i][j] = arr1[i][j] - arr2[i][j];
            printf("%3d ", diff[i][j]);
        }
        printf("\n");
    }

    return 0;
}