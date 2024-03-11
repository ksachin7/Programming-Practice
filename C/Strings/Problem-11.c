// TODO-11 what will be the value of i after the execution of code fragment given below:
#include <stdio.h>
#include <string.h>
int main()
{
    static char str1[] = "dills";
    static char str2[] = "dills";
    static char str3[] = "daffo";
    int i;
    // printf("%s", strcpy(str2, str1));

    i = strcmp(strcat(str3, strcpy(str2, str1)), "daffodills");
    printf("%d", i);

    return 0;
}
// Output: Illegal instruction: 4
// Explanation: strcmp(strcat(str3, strcpy(str2, str1)), "daffodills") --> strcmp(strcat(str3, "dills"), "daffodills") -
// -> strcmp(strcat("daffo", "dills"), "daffodills") --> strcmp("daffodills", "daffodills") --> 0.
// strcmp returns 0 if both strings are equal, returns >0 if first non-matching char is greater in str1 than str2
// and returns <0 if first non-matching char in str1 is smaller than str2.
