// TODO-3. Write a for loop to print numbers from 1 to 20. The for loops has to be written as a multiline macro
// Ex: forlo(1, 20); => prints numbers from 1 to 20; forlo here is a multiline macro
#include <stdio.h>
#define LOOP(n)                  \
    for (int i = 1; i <= n; i++) \
    {                            \
        printf("%d\t", i);       \
    }

int main()
{
    LOOP(20);
    printf("\n");
    return 0;
}
