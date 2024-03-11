// TODO-5   what will be the output:
#include <stdio.h>
int main()
{
    int i, a[4] = {3, 1, 2, 4}, result;
    result = a[0];
    for (i = 1; i < 4; i++)
    {
        if (result > a[i])
            continue;
        result = a[i];
    }
    printf("%d\n", result);

    return 0;
}
// Output: 4
// Result is assigned to a[0] i.e. 3 and for loop is looping through all elements of the array.
// if condition is checking if (result > the element) then do nothing
// otherwise make result = element greater than 3 i.e 4 here. so printing 4 in the printf statement and that is the output.
