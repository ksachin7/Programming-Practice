// TODO Write a C program to check whether the given number(n) can be expressed as Power of Two (2) or not. For example 8 can be expressed as 2^3.
#include <stdio.h>
int main()
{
    int n, tmp; // declaring variables
    printf("Enter the number: ");
    scanf("%d", &n); // taking inputs
    tmp = n;
    if (tmp == 0) // checking if tmp is 0 if so can't expressed as power of 2 otherwise goes to else
    {
        printf("0 can't be expressed as power of 2.\n");
    }
    else
    {

        while (tmp != 1)
        {
            if (tmp % 2 != 0) // checking if the no. is odd if so skip otherwise goes to else
                break;
            else
            {
                tmp = tmp / 2; // divide the no. by 2 untill the loop runs or val of tmp becomes 1.
                printf("%d\n", tmp);
            }
        }
        if (tmp == 1) // if value of tmp euals to 1 prints the number can be expressed as power of 2 otherwise it can't.
            printf("%d can be expressed as power of 2.", n);
        else
            printf("%d can't be expressed as power of 2.", n);
    }

    return 0;
}