// TODO-5. Design a structure student_record to contain name, branch and total marks obtained. Develop a program to
// read data for 10 students in a class and print them.
#include <stdio.h>
struct student_record
{
    char name[20];
    char branch[20];
    int obtained_marks;
} p[10];

int main(void)
{
    int i = 0, n = 3;

    for (i = 0; i < n; i++)
    {
        printf("\n Enter Student Name : ");
        scanf(" %[^\n]s", p[i].name);
        printf(" Enter Students Branch : ");
        scanf(" %[^\n]s", p[i].branch);
        printf(" Enter Students Marks : ");
        scanf("%d", &p[i].obtained_marks);
    }

    for (i = 0; i < n; i++)
    {
        printf("\n\n Student %d Detail", i + 1);
        printf("\n Name           : %s", p[i].name);
        printf("\n Branch         : %s", p[i].branch);
        printf("\n Obtained marks : %d", p[i].obtained_marks);
    }
    printf("\n");
    return 0;
}