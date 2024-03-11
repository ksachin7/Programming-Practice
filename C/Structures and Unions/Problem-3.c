// TODO-3. Define structure data type called time_struct containing three member’s integer hour, integer minute and integer second.
// Develop a program that would assign values to the individual number and display the time in the following format: 16: 40:51
#include <stdio.h>
struct time_struct
{
    int hour;
    int minute;
    int second;
} t;

int main(void)
{
    printf("\n Enter Hour : ");
    scanf("%d", &t.hour);
    printf(" Enter Minute: ");
    scanf("%d", &t.minute);
    printf(" Enter Second : ");
    scanf("%d", &t.second);

    printf("\n Time %.2d:%.2d:%.2d\n", t.hour % 24, t.minute % 60, t.second % 60);

    return 0;
}