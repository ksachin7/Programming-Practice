// Write a simple structure called student containing fields(int id, char gender and char name[size];
// Create a variable of this structure(ex: std1), fill in the fields of this structure variable and use a pointer to std1 which changes the member values for std1.
#include <stdio.h>
#include <string.h>
struct student
{
    int id;
    char gender, name[256];
};
int main()
{
    struct student std1, *ptr;
    ptr = &std1;
    std1.id = 001;
    std1.gender = 'M';
    strcpy(std1.name, "Sachin Kumar");
    printf("ID: %3.3d\n", ptr->id);
    printf("Gender: %c\n", ptr->gender);
    printf("Name: %s\n", ptr->name);

    ptr->id = 116;
    printf("Changed ID: %3.3d\n", ptr->id);

    return 0;
}
