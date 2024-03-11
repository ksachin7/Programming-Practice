// TODO-5 Write a c program to copy string without using library functions
#include <stdio.h>
// int sum = 0;
char *strcp(char[], char[]);
int main()
{
    char source[256], destination[256];
    printf("Enter source string: ");
    scanf("%[^\n]s", source);

    printf("String from destination: %s\n\n", strcp(destination, source));
    return 0;
}
char *strcp(char str1[], char str2[])
{
    printf("%s", str1);
    int i = 0;
    while (str2[i] != '\0')
    {
        str1[i] = str2[i];
        i++;
    }

    return str1;
}
