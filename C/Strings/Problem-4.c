// TODO-4: Write a C Program to reverse a given word using function. e.g. INDIA should be printed as AIDNI
#include <stdio.h>
#include <string.h>
int main()
{
    char str[256];
    printf("Enter a string: ");
    scanf("%255[^\n]%*c", str);
    int len = strlen(str);

    // printf("length: %d", len);
    while (len != 0) // while length of string is not zero printing chars. from the end
    {
        printf("%c", str[(len - 1)]);
        len--;
    }
    printf("\n");

    return 0;
}