// TODO-8   what will be the output:
#include <stdio.h>
int main()
{
    int i = 0;
    char c = 'a';
    while (i < 5)
    {
        i++;
        switch (c)
        {
        case 'a':
            printf("%c", c);
            break;
        }
    }
    printf("a\n");

    return 0;
}
// Output : aaaaaa  printed 6-times as after while there is another one printf statement.
// while prints a 5-times as condition specified and switch is switching c to a as case a.
