// TODO: What is output of following program?
#include <stdio.h>
int main()
{
    int a = 12, b = 18, c = 7, d = 4, result;
    result = a + a * -b / c % d + c * d; // 12+12*-18/7%4+7*
    printf("%d\n", result);
    return 0;
}
// Output : 38