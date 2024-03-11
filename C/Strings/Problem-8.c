// TODO-8 what will be the output of following code
#include <stdio.h>
int main()
{
    char str1[] = "Week-7-Assignment";
    char str2[] = {'W', 'e', 'e', 'k', '-', '7', '-', 'A', 's', 's', 'i', 'g', 'n', 'm', 'e', 'n', 't'};
    int n1 = sizeof(str1) / sizeof(str1[0]); // 18/1= 18 because \0 is added at the end of the string
    int n2 = sizeof(str2) / sizeof(str2[0]); // 18/1=17

    printf("n1= %d n2= %d", n1, n2);
    // printf("%d", 18 / 1);
    printf("\n%lu %lu", sizeof str2, sizeof str2[0]);
    return 0;
}
// Output: n1= 18 n2= 17
// Explanation: if size of array is not specified then in case of double quoted array of chars, at the end
// a "\0"(NULL Char) will get assigned by compiler but not assigned in case two of comma separated array of chars.
// so the size of str1 will become 18 but size of str2 remains as it is i.e. 17.
