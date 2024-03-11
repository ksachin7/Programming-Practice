// TODO-2. Using extern keywords, declare variable in another file(second.c) , and in another file(first.c), utlize that variable.
#include <stdio.h>
#include "ext.c"
extern int var;
int main()
{
    printf("%d\n", var);
    return 0;
}