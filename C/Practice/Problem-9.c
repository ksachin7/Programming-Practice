// TODO: What is output of following program?
#include <stdio.h>
int main()
{
    int i;
    if (i = 0, 2, 3) // assignment operator evaluates right to left.
                     // prints garbage value of i. i.e. non zero so condition becomes true
        printf("CDAC ");
    else
        printf("C Programming ");
    printf("%d\n", i);
    return 0;
}
// Output : CDAC