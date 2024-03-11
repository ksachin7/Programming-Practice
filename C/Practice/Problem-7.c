// TODO: Write a C Program to find the Largest Integer among Three integers using if statement.
//  Note: To take input using single line Use scanf(“%d %d %d”, &num1, &num2, &num3);
#include <stdio.h>
int main()
{
    int i, j, k;
    printf("Enter three numbers seperated by space: ");
    scanf("%d%d%d", &i, &j, &k);
    if (i > j)
    {
        if (i > k)
            printf("%d is the largest number.", i);
        else

            printf("%d is the largest number.", k);
    }
    else if (j > k)
        printf("%d is the largest number.", j);
    else
        printf("%d is the largest number.", k);

    return 0;
}
