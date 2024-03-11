// TODO-9 what will be the output of following code
#include <stdio.h>
#include <string.h>

int main()
{
    char str1[20] = "Hello";
    char str2[20] = "world";
    printf("%s", strcpy(str2, strcat(str1, str2)));

    return 0;
}
// Output: Helloworld
// Explanation: strcpy() and strcat are built-in function of string.h library.
// strcpy(): copies source string(str2) to destination string(str1) and returns destination string.
// strcat(): function concatenate source and destination strings and stores the result in the destination string and returns the same.
// strcpy(str2, strcat(str1, str2)) --> strcpy(str2, "Helloworld") --> Helloworld
