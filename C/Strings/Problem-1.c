// TODO-1: Write a C Program to Count Number of Uppercase and in a given string. The string may be a word or a sentence.
#include <stdio.h>
#include <string.h>
#include <ctype.h>
void upper(char[]);
void lower(char[]);

int main()
{
    char str[256];
    // char str[0];
    printf("Enter a string: ");
    scanf("%255[^\n]%*c", str); //  %*c to remove trailing \n
                                // scanf("%[^\n]s", str);
                                // scanf("%[^\n]c", str2);
                                // fgets(str, 255, stdin);

    // printf("%lu\n", sizeof str);
    // printf("%s", str);

    upper(str);
    lower(str);

    return 0;
}

void upper(char str[])
{
    int upper = 0;

    for (int i = 0; str[i] != '\0'; i++)
    {
        // printf("%lu", sizeof str);
        if (isupper(str[i]))
            upper += 1;
    }
    // printf("%lu\n", sizeof str); // when you use sizeof op inside it will return size of pointer not the actual size of that.
    printf("\nUppercase Letters : %d\n", upper);
}
void lower(char str[])
{
    int lower = 0;

    for (int i = 0; str[i] != '\0'; i++)
    {
        // printf("%lu", sizeof str);
        if (islower(str[i]))
            lower += 1;
    }
    // printf("%lu\n", sizeof str); // when you use sizeof op inside it will return size of pointer not the actual size of that.
    printf("Lowercase Letters : %d\n", lower);
}

// Second method:
#include <stdio.h>
int main()
{
    char str[256];
    int upper = 0, lower = 0;
    printf("Enter a string: ");
    scanf("%255[^\n]%*c", str);

    for (int i = 0; str[i] != '\0'; i++)
    {
        if (str[i] >= 'A' && str[i] <= 'Z') // or instead of alphabet you can take ASCII value of that char too.
        {
            upper += 1;
        }
        else if (str[i] >= 'a' && str[i] <= 'z')
        {
            lower += 1;
        }
        else
            continue;
    }
    printf("\nUppercase Letters : %d\n", upper);
    printf("Lowercase Letters : %d\n", lower);

    return 0;
}
