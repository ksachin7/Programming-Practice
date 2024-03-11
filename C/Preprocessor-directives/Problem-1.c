// TODO-1. Define a variable inside a header file, say “custom.h”, use this header file in your program
// and then print the value of the variable defined in custom.h.
#include <stdio.h>
#include "custom.h"
int main()
{
    printf("%d\n", var); // var is defined in custom.h
    return 0;
}