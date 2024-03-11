// TODO-2: Write a C program to print Largest and Smallest Word from a given sentence.
// If there are two or more words of same length then the first one is considered. Here single letter such as
// "I" , "a" is considered as a word
#include <stdio.h>
#include <string.h>

int main()
{
    char str[256], words[100][100], small[100], large[100];
    int i = 0, j = 0, k, length;

    printf("Enter a string: ");
    scanf("%255[^\n]%*c", str);

    // Split the string into words such that each row of array words represents a word
    for (k = 0; str[k] != '\0'; k++)
    {

        // Here, i represents row and j represents column of two-dimensional array words
        if (str[k] != ' ' && str[k] != '\0')
        {
            words[i][j++] = str[k];
        }
        else
        {
            words[i][j] = '\0';
            // Increment row count to store new word
            i++;
            // Set column count to 0
            j = 0;
        }
    }
    // Store row count in variable length
    length = i + 1;

    // Initialize small and large with first word in the string
    strcpy(small, words[0]);
    strcpy(large, words[0]);

    // Determine smallest and largest word in the string
    for (k = 0; k < length; k++)
    {

        // If length of small is greater than any word present in the string
        // Store value of word into small
        if (strlen(small) > strlen(words[k]))
        {
            strcpy(small, words[k]);
        }
        // If length of large is less than any word present in the string
        // Store value of word into large
        if (strlen(large) < strlen(words[k]))
            strcpy(large, words[k]);
    }

    printf("Smallest word: %s\n", small);
    printf("Largest word: %s\n", large);

    return 0;
}

//? program for largest word with count
#include <stdio.h>
#include <string.h>
int main()
{
    char str[256], buffer[256], max_word[256], min_word[256], delimiters[] = " ,.?|/<>:{}[];\n\t*+=$-'!#%";
    int i = 0, max = -1, min = -1;
    printf("Enter a string: ");
    scanf("%255[^\n]%*c", str);
    // int size = sizeof(str);
    // printf("%lu", sizeof str);
    // printf("%lu\n", strlen(str));
    int len = strlen(str);
    // printf("%d\n", len);

    while (i < len)
    {
        // printf("len: %d\n", len);
        // printf("i: %d\n", i);

        int count = 0;
        while (i < len)
        {
            if (strchr(delimiters, str[i]) != NULL) // if any delimiter is found then it will stop counting
                break;
            buffer[count] = str[i]; // to store the word in buffer
            i++;
            count++;
            // printf("%d\n", count);
        }
        // printf("i after while-1: %d\n", i);

        buffer[count] = '\0'; // to put the null char after end of the word
        if (count > max)      // if the current word count is greater than max size word then make it max
        {
            max = count;
            strcpy(max_word, buffer);
        }
        // else
        // {
        //     min = count;
        //     strcpy(min_word, buffer);
        // }

        while (i < len)
        {
            if (strchr(delimiters, str[i]) == NULL) // if any non delimiter chr is found(means it reached to first letter of next word) then break otherwise increase the array index
                break;
            i++;
        }
        // printf("i after while: %d\n", i);
    }
    printf("Largest word is: %s(%d)\n", max_word, max);
    // printf("Smallest word is: %s(%d)\n", min_word, min);

    return 0;
}