// TODO: What is output of following program?
#include <stdio.h>
int main()
{
    int y = 10;
    int z = y + (y == 10);
    printf("%d\n", z);
    return 0;
}
// Output : 11