// TODO-20 The function func is used to find?
#include <stdio.h>
int func(int, int, int);

int main()
{
    int a = 10, b = 20, c = 30;
    printf("%d", func(a, b, c));
    return 0;
}
int func(int a, int b, int c)
{
    if ((a >= b) && (c < b))
    {
        return b;
        printf("%d", b);
    }

    else if (a >= b)
    {
        return func(a, c, b);
    }
    else
        return func(b, a, c);
}
// Output: 20
// Explanation:
// func(a,b,c) returns the median element of the a, b and c,but not the middle element of a , b and c. But if a = b = c,
// then infinite loop.
// The median is the middle number in a sorted, ascending or descending, list of numbers.

/* ( - wrong! - checking if (20 >= 10 && 30 < 20) i.e. false so control goes to else if (10>=20) i.e. false
so agin control goes to else statement which recalls the function but shuffled the parameter as func(b,a,c)
and check conditions again and will keep checking until the if statement condition get satisfied and then it will print the value of b
that would be in the function at that time as values keep changing in every recursion.) */