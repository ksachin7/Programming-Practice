// TODO-13 what will be the output of following code
#include <stdio.h>
void fu(int, int);
int main()
{
    char x = 67, y = 'C';
    fu(x, y);
    return 0;
}
void fu(int x, int y)
{
    printf("%d,%d", x, y);
}
// Output: 67,67
// Explanation: the function taking x=67 and y='C' i.e. 67(Taking Decimal value of ASCII char. as converting from char to int)
