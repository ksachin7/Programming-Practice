// TODO: What is output of following program?
#include <stdio.h>
int main()
{
    int a = 1, b = -1, c = 0, d;
    d = ++a && ++b || c--;
    // printf("%d %d %d %d ", a, b, c, d);
    if (d)
        printf("Kolkata\n");
    else if (c) // (c= -1)anything non zero is a true condition
        printf("Delhi\n");
    else
        printf("Bangalore\n");
    return 0;
}
// Output : Delhi
