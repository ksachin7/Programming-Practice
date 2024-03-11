// TODO: Write a C Program to find the Smallest Integer among Three integers using IF and Logical && operator.
#include <stdio.h>
int main()
{
    int i, j, k;
    printf("Enter three numbers seperated by space: ");
    scanf("%d%d%d", &i, &j, &k);
    if (i < j && i < k)
    {
        printf("%d is the smallest number", i);
    }
    else
    {
        if (j < k)
            printf("%d is the smallest number", j);
        else

            printf("%d is the smallest number", k);
    }
    return 0;
}