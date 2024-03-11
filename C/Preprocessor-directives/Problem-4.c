// TODO-4. Give example usage of conditional compilation using #ifdef, #ifndef and #undef.
#include <stdio.h>
#define X 56
// #ifndef Sachin
// #error Sachin not found!
// #endif
#define Y 156
#ifdef Y
#undef Y
#endif

#if X > 50
#undef X
#define X 36
#elif X < 50
#undef X
#define X 50
#else
#undef X
#define X 100
#endif

int main()
{
    printf("X= %d\n", X);

    return 0;
}