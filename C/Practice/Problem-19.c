// TODO Write a C Program to find the Smallest Integer among Three integers using IF and Logical && operator.
#include <stdio.h>
int main()
{
    int i, j, k;
    printf("Enter three numbers seperated by space: ");
    scanf("%d %d %d", &i, &j, &k); // took three numbers from user

    // checking if i is less than j and k if yes then it i will be smallest otherwise control goes to
    // else statement and check if j<k if yes then will print j is smallest otherwise k would be the smallest.
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