// TODO-1. Using Static keyword, keep a count of the number of times a function was called.
#include <stdio.h>
int fun()
{
    static int count = 0;
    count++;
    return count;
}

int main()
{
    printf("%d ", fun());
    printf("%d ", fun());
    printf("%d ", fun());
    printf("%d ", fun());
    printf("%d ", fun());
    printf("\n");
    return 0;
}