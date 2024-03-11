// TODO-4 Write a program in C to find all prime numbers from 1 to n
#include <stdio.h>
int main()
{
    int num, flag;
    printf("Enter a number: ");
    scanf("%d", &num);

    printf("Prime numbers are: ");
    while (num != 0)
    {
        if (num <= 1)
            flag = 1;
        else if (num == 2 || num == 3)
            flag = 0;
        else
        {
            for (int i = 2; i <= num / 2; i++)
            {
                flag = 0;

                if (num % i == 0)
                {
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0)
            printf("%d ", num);
        num--;
    }

    return 0;
}