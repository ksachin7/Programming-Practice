
// This program will print reverse of the number user will input.
#include <stdio.h>
int main()
{
    int n, x = 0, y;
    printf("Enter an integer");
    scanf("%d", &n);
    while (n != 0) // the loop will run n-times
    {
        y = n % 10;     // finding the last digit
        x = x * 10 + y; //
        n = n / 10;
    }
    printf("Output is %d\n", x);

    return 0;
}

// If statement has provided non zero parameter i.e. 1 as postfix decrement will happen later so its printing True.
#include <stdio.h>
// #include <ctype.h>
int main()
{
    int a = 1;
    if (a--)
        printf("True\n");
    if (a++)
        printf("False\n");

    return 0;
}

// The output would be 0.00000 as si is declared as int and format-specifier is %f so getting a warning message.
// we should use si as of float type then it will print the correct answer without warning i.e. 15000000.000000.
#include <stdio.h>
// #include <ctype.h>
int main()
{
    int p, t;
    float r, si;
    p = 5000, t = 4, r = 7.5;
    si = (p * t * r) / 100;
    printf("%f\n", si);
    return 0;
}

//  Here 'a' declared as int but starting with 0 so compiler treat it as octal value.
// Here printing a as int so it will print it respective value of int i.e. 65
#include <stdio.h>
// #include <ctype.h>
int main()
{
    int a = 0101;
    float r;

    printf("\na=%d", a);
    return 0;
}

//  Here using assignment operator in if statement that will assign 5 to var1
// i.e. non-zero value is provided in if so condition will get true and will increment var2. and after loop end it will print 5 and 7.
#include <stdio.h>
// #include <ctype.h>
int main()
{
    int var1 = 10, var2 = 6;
    if (var1 = 5)
        var2++;
    printf("%d%d\n", var1, var2++);

    return 0;
}

// Here in first printf (i++ && ++j) as postfix increment, i will not increment in here, it will increment later.
// so as i will be 0 it will not evaluate further and print 0.
// in second printf i will become 1 but j will stay 1. Therefore will print 11
#include <stdio.h>
// #include <ctype.h>
int main()
{
    int i = 0, j = 1;
    printf("\n%d", i++ && ++j);
    printf("\n%d%d", i, j);

    return 0;
}
// num = 123 step - 1 var = num % 10 step - 2 num = num / 10

#include <stdio.h>
int main()
{
    int arr[] = {1, 2, 3};
    printf("%d\n", arr[3]);

    // for (;;)
    // {
    //     printf("%s\n", arr);
    // }
    return 0;
}

#include <stdio.h>
#include <ctype.h>
int main()
{
    int x = 7;
    printf("%d \n", isnumber(x));
    printf("%0x \n", &x);

    return 0;
}

#include <stdio.h>
#include <ctype.h>
int main()
{
    int n = 7, q, *p;
    int p = &n;
    n = 11;
    q = **p;
    printf("%d \n", q);

    return 0;
}