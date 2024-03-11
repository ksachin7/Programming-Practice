// TODO-14 what will be returned by the function f(1)
#include <stdio.h>
int f(int);
int main()
{
    printf("%d", f(1));
    return 0;
}
int f(int n)
{
    static int i = 1;
    if (n >= 5)
        return n;
    n = n + i;
    i++;
    return f(n);
}
// Output: 7
// Explanation: f(1) --> f(2+1) --> (4+1) --> f(6+1) --> n i.e 7
// first f(1) is called in main() then n = n+i= 1+1 then i incremented so n becomes 3 and f(3) get called and so on.
