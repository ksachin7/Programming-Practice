// TODO-15 How many 'Hi' will be printed in the program:
#include <stdio.h>
int i;
int fun();
int main()
{
    // printf("%d\n", i);  // the value of is 0
    while (i)
    {
        fun();
        main();
    }
    printf("Hello\n");
    return 0;
}
int fun()
{
    printf("Hi");
}
// Output: 0 Hi will be printed and instead Hello will be printed.
// Explanation: i is a global variable so it will be initialized automatically to 0 during time of declaration.
// so while is passing the value of i i.e. 0 so condition will become false and therefore while loop will never execute
// and functions inside whhile will never get called and so will just print Hello.
