//* Command Line Arguments:
//! Problem: 1
#include <stdio.h>

int main(int argc, char **argv)
{
    printf("%s\n", argv[argc - 1]);
    return 0;
}

//! Problem: 2
#include <stdio.h>

int main(int argc, char *argv[])
{
    printf("%c", **++argv);
    return 0;
}

//! Problem: 3
/* sample.c */
#include <stdio.h>

int main(int argc, char *argv[])
{
    while (--argc > 0)
        printf("%s", *++argv);
    return 0;
}
// cmd> sample monday tuesday wednesday thursday
// output: monday tuesday wednesday thursday

//! Problem: 4
/* sample.c */
#include <stdio.h>
#include <dos.h>

int main(int arc, char *arv[])
{
    int i;
    for (i = 1; i < _argc; i++)
        printf("%s ", _argv[i]);
    return 0;
}
// cmd> sample Jan Feb Mar
// output: Jan Feb Mar

//! Problem: 5
#include <stdio.h>

int main(int argc, char *argv, char *env[])
{
    int i;
    for (i = 1; i < argc; i++)
        printf("%s\n", env[i]);
    return 0;
}
// output: list of environment variables

//! Problem: 6
/* myprog.c */
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
    int i, j = 0;
    for (i = 0; i < argc; i++)
        j = j + atoi(argv[i]); // atoi function converts string(eg. "123") to an integer.
    printf("%d\n", j);
    return 0;
}
// cmd> myprog 1 2 3
// output: 6

//! Problem: 7
/* sample.c */
#include <stdio.h>

int main(int sizeofargv, char *argv[])
{
    while (sizeofargv)
        printf("%s", argv[--sizeofargv]);
    return 0;
}
// cmd> sample friday tuesday sunday
// output: sunday tuesday friday sample

//! Problem: 8
/* myprog.c */
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
    int i;
    for (i = 1; i <= 3; i++)
        printf("%u\n", &argv[i]);
    return 0;
}
// cmd> myprog one two three
// output: 65517 65519 65521

//* Memory allocation:
//! Problem: 1
#include <stdio.h>
#include <stdlib.h>
#define MAXROW 3
#define MAXCOL 4

int main()
{
    int **p, i, j;
    p = (int **)malloc(MAXROW * sizeof(int *));
    return 0;
}

//! Problem: 2
#include <stdio.h>
#include <string.h>

int main()
{
    char *s;
    char *fun();
    s = fun();
    printf("%s\n", s);
    return 0;
}
char *fun()
{
    char buffer[30];
    strcpy(buffer, "RAM");
    return (buffer);
}
// output: Garbage value

//! Problem: 3
#include <stdio.h>
#include <stdlib.h>
#define MAXROW 3
#define MAXCOL 4

int main()
{
    int(*p)[MAXCOL];
    p = (int(*)[MAXCOL])malloc(MAXROW * sizeof(*p));
    printf("%d, %d\n", sizeof(p), sizeof(*p));
    return 0;
}
// output: 8, 16

//! Problem: 4
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *p;
    p = (int *)malloc(256 * 256);
    if (p == NULL)
        printf("Allocation failed");
    return 0;
}
// Allocation failed:  256*256 = 65536 is passed to malloc() function which can allocate upto 65535.
// So the memory allocation will be failed in 16 bit platform (Turbo C in DOS).

//! Problem: 5
void main(int argc, char *argv[])
{
    int I, j = 0;
    for (I = 0; I < argc; I++)
        j = j + atoi(argv[I]);
    printf(“% d”, j);
}
// command :newprog 1 2 3
// error

//! Problem:
#include <stdio.h>
#include <stdlib.h>

int main()
{
    unsigned char a;
    a = 0xFF + 1;
    printf("%d", a);
}

//! Problem:
#include <stdio.h>
#define T t
void main()
{
    char T = 'T';
    printf("\n%c\t%c\n", T, t); // this won't cause any error
    for (int count = 1; count <= 10; count = count + 1)
        printf("% d\n", count);
}

//! Problem:
#include <stdio.h>
void main()
{
    int arr[2][3][2] = {{
                            {2, 4},
                            {7, 8},
                            {3, 4},
                        },
                        {
                            {2, 2},
                            {2, 3},
                            {3, 4},
                        }};
    printf("\n % d", **(*arr + 1) + 2 + 7);
}

//! Problem:
#include <stdio.h>
void main()
{
    int i = 100, j = 200;
    const int *p = &i;
    p = &j;
    printf("% d", *p);
}

//! Problem:
#include <stdio.h>
void main()
{
    int arr[] = {10, 20, 30, 40, 50};
    int *ptr = arr;
    printf("\n % d\t % d\t", *ptr++, *ptr);
}

//! Problem:
#include <stdio.h>
struct num
{
    int no;
    char name[25];
};
void main()
{
    struct num n1[] = {{25, "”rose”"}, {20, "”gulmohar”"}, {8, "”geranium”"}, {11, "”dahalia”"}};
    printf("%d%d", n1[2].no, (*&n1 + 2)->no + 1);
}

//! Problem:
#include <stdio.h>
int main()
{
    printf("\n%c", "abcdefgh"[4]);
}

//! Problem:
#include <stdio.h>
void main()
{
    int a = 0;
    int b = 0;
    ++a == 0 || ++b == 22;
    printf("\n % d, % d", a, b);
}

//! Problem:
#include <stdio.h>
#include <string.h>
void main()
{
    while (1)
    {
        if (printf("%d", printf("%d")))
            break;
        else
            continue;
    }
}

//! Problem:
#include <stdio.h>
main()
{
    register int a = 2;
    printf("\nAddress of a = % d,", &a);
    printf("\tValue of a = % d", a);
}

//! Problem:
//!*? --important--
#include <stdio.h>
int main()
{
    int a[5] = {5, 1, 15, 20, 25};
    int i, j, m;
    i = ++a[1]; //  i=2
    j = a[1]++; //  j=2    a[1]=3
    m = a[i++]; //  a[i]= 15    i=3
    printf("%d, %d, %d\n", i, j, m);
    return 0;
}
// output: 3 2 15

//! Problem:
#include <stdio.h>
int main()
{
    int arr[1] = {10};
    printf("%d\n", 0 [arr]);
    return 0;
}

//! Problem:
#include <stdio.h>
void fun(int);
// typedef int (*pf)(int, int);
// int proc(pf, int, int);
int main()
{
    int a = 3;
    fun(a);
    return 0;
}
void fun(int n)
{
    if (n > 0)
    {
        fun(--n);
        printf("%d,", n);
        fun(--n);
    }
}