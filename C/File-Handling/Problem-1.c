// TODO-1. Write a program in C to write multiple lines in a text file.
#include <stdio.h>
#include <stdlib.h>
int main()
{
    FILE *fptr;
    fptr = fopen("mytext.txt", "w");
    if (fptr == NULL)
    {
        printf("Error!");
        exit(-1);
    }
    char str[256];
    int n;
    printf("Enter number of lines to write: ");
    scanf("%d", &n);

    printf("Enter %d line of txt: \n", n);
    for (int i = 0; i < n; i++)
    {
        scanf(" %[^\n]s", str);
        fprintf(fptr, "%s\n", str);
    }
    printf("\nTexts got written in 'mytext.txt' go check!\n");
    fclose(fptr);
    return 0;
}