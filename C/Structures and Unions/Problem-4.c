// TODO-4. Define a structure called cricket that will describe the following information: Player name Team name Batting average
// Using cricket, declare an array player with 50 elements and write a C program to read the information about all the 50 players and print team-wise list containing names of players with their batting average.
#include <stdio.h>
#include <string.h>
struct cricket
{
    char pname[20];
    char tname[20];
    float batavg;
};

int main()
{
    struct cricket c[5], t;
    int i, j, n = 5;
    float p;

    printf("\nEnter data of %d players", n);
    for (i = 0; i < n; i++)
    {
        printf("\nEnter Player Name for player-%d = ", i + 1);
        scanf(" %[^\n]s", c[i].pname);

        printf("Enter Team Name for player-%d = ", i + 1);
        scanf(" %[^\n]s", c[i].tname);

        printf("Enter Batting Avg. for player-%d = ", i + 1);
        scanf("%f", &c[i].batavg);
    }

    for (i = 1; i <= n - 1; i++)
    {
        for (j = 1; j <= n - i; j++)
        {
            if (strcmp(c[j - 1].tname, c[j].tname) > 0)
            {
                t = c[j - 1];
                c[j - 1] = c[j];
                c[j] = t;
            }
        }
    }

    printf("\nTeamwise Player list: ");
    printf("\n %*s", -20, "Players");
    printf("%*s", -20, "Team");
    printf("%*s", -20, "Batting_Avg.");

    for (i = 0; i < n; i++)
    {
        printf("\n%-20s %-20s %.2f", c[i].pname, c[i].tname, c[i].batavg);
    }
    printf("\n");
    return 0;
}
