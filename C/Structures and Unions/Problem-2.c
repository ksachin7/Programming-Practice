// TODO-2. Define a structure type struct personal that would contain person name, date of joining and salary
// using this structure to read this information of 5 people and print the same on screen.
#include <stdio.h>
struct person
{
    char name[56];
    char doj[10];
    float salary;
} p[5];

int main(void)
{
    for (int i = 0; i < 5; i++)
    {
        printf("\nEnter Name : ");
        scanf(" %[^\n]s", p[i].name);

        printf("Enter %s's Date of Joining (dd-mm-yyyy) : ", p[i].name);
        scanf(" %[^\n]s", p[i].doj);

        printf("Enter %s's Salary : ", p[i].name);
        scanf("%f", &p[i].salary);
    }

    for (int i = 0; i < 5; i++)
    {
        printf("\n\n %s details: ", p[i].name);
        printf("\n Name   = %s", p[i].name);
        printf("\n DOJ    = %s", p[i].doj);
        printf("\n Salary = %.2f", p[i].salary);
    }
    return 0;
}