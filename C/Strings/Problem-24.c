// TODO-4 Write a c program to concatenate two strings without using library functions
#include <stdio.h>
// int sum = 0;
unsigned int strln(char[]);
void concatenate(char[], char[]);
int main()
{
    char str1[256], str2[256];
    printf("Enter a string: ");
    scanf("%[^\n]s", str1);
    printf("Enter another string: ");
    scanf(" %[^\n]s", str2);

    // printf("%u\n", strln(str1));
    // printf("%u\n", strln(str2));

    concatenate(str1, str2);
    return 0;
}
unsigned int strln(char str[])
{
    int i = 0;
    while (str[i] != '\0')
        i++;
    return i;
}
void concatenate(char str1[], char str2[])
{
    printf("str1: %s\n", str1);
    int size = strln(str1) + strln(str2);
    // printf("size]: %u\n", size);

    // char str[size] = '\0'; // error: variable-sized object may not be initialized
    char str[size];
    // printf("str[size]: %lu\n", sizeof str);

    for (int i = 0; str1[i] != '\0'; i++)
    {
        str[i] = str1[i];
        // printf("str[%d]: %c\n", i, str[i]);
    }
    str[strln(str1)] = '\0';
    printf("The 1st string is: %s\n", str);

    for (int i = 0, j = strln(str); str[i] != '\0'; i++, j++)
    {
        str[j] = str2[i];
        printf("str[%d]: %c\n", i, str[i]);
    }
    printf("\nThe concatenated string is: %s\n", str);
}