// TODO: What is output of following program?
#include <stdio.h>
int main()
{
    int a = 1, b = 2, c = 3;
    if (c > b > a)
    {
        printf("True\n");
    }
    else
        printf("False\n");
    return 0;
}
// Output : False