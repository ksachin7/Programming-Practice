// TODO-15 Write a C program to find the sum of all elements of each row of a matrix.
// Input number of rows and number of cols from user. Now input all rows*cols values from user
#include <stdio.h>
int main()
{
    int row, col, sum = 0, arr[10][10];
    printf("Enter the rows and coloumn for matrix separated by space: ");
    scanf("%d %d", &row, &col);

    // enter elements in matrix
    printf("Enter the elements of the array: \n");
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            printf("arr[%d][%d]: ", i, j);
            scanf("%d", &arr[i][j]);
        }
    }
    // print the matrix
    printf("\n--The matrix-- \n");
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            printf("%3d ", arr[i][j]);
        }
        printf("\n");
    }
    // print the sum of elements of the matrix
    printf("\nThe sum of elements of the matrix is: ");
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            sum += arr[i][j];
        }
        printf("%d\n", sum);
    }

    return 0;
}