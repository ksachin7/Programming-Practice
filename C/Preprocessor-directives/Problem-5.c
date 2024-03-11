// TODO-5. Concat two numbers to create a single number using ## operator:
#include <stdio.h>
#define concat(x, y) x##y
int main()
{
    int xy = 56;
    printf("%d\n", concat(x, y));
}
// Ex: 11882, 619 => 61911882
