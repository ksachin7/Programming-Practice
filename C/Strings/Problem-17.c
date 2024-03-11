// TODO-17 what will be the output of following code
#include <stdio.h>
int main()
{
    int i;
    for (i = 0; i < 5; i++)
    {
        // printf("%d ", &i);
        int i = 10;
        printf("%d ", i);
        i++;
        // printf("%d  ", &i);
    }
    return 0;
}
// Output: 10 10 10 10 10
// Explanation: i is redefined in for loop again, both i holds different memory location. So printed 10, 5-times.
