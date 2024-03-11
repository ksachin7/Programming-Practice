// TODO-2 Write a program in C to read the file and store the lines into an array.
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    FILE *fptr = NULL;
    char fname[10];
    char line[10][128];
    int i = 0, tot = 0;
    printf("Enter the name of file to open: ");
    scanf("%s", fname);
    fptr = fopen(fname, "r");
    while (fgets(line[i], 128, fptr))
    {
        line[i][strlen(line[i]) - 1] = '\0';
        i++;
    }
    tot = i;
    // if (fptr == NULL)
    // {
    //     printf("Error!");
    //     exit(-1);
    // }
    printf("Contents of the file: \n");
    for (int i = 0; i < tot; i++)
    {
        printf(" %s\n", line[i]);
    }
    printf("\n");
    // fclose(fptr);
    return 0;
}