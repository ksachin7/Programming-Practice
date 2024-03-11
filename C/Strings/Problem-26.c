// TODO-6 Write a c program to find length of string without using library functions
#include <stdio.h>
// int sum = 0;
int strl(char[]);
int main()
{
    char str[256];
    printf("Enter a string: ");
    scanf("%[^\n]s", str);

    printf("The string's length is: %d\n", strl(str));
    return 0;
}
int strl(char str[])
{
    printf("%s", str);
    int i = 0;
    while (str[i] != '\0')
        i++;
    return i;
}
