// TODO-12 what will be the output of following code
#include <stdio.h>
#include <string.h>
int main()
{
    char p[] = "assignment";
    char t;
    int i, j;
    for (i = 0, j = strlen(p); i < j; i++)
    {
        t = p[i];
        p[i] = p[j - i];
        p[j - i] = t;
    }

    printf("%s", p);
    return 0;
}
// Output: No-output
// Explanation: p will initialize as ['a', 's','s','i','g','n','m','e','n','t,'\0']
// After the first iteration value of p will swap and will be ['\0', 's','s','i','g','n','m','e','n','t,'a']
// Then the loop will terminate because the 0-th element is '\0'. and will print nothing as '\0' terminates a string.
