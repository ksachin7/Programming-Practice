// TODO-10 to get the output as"Hwi orea", what should be the condition inside if statement?
#include <stdio.h>
int main()
{
    int i;
    char s[] = "How is your exam";

    for (i = 0; s[i] != '\0'; ++i)
    {
        if (i % 2 == 0)
        {
            printf("%c", s[i]);
        }
    }
    return 0;
}
// Output: Hwi orea
// Explanation: The required condition should be "i%2 == 0" as it is printing chars. at even index.
