/*
#include <iostream>

int main()
{
    int x = 10;
    int y = x++;
    int z = ++x;

    std::cout << x << std::endl;
    // std::cout << y<<std::endl;
    // std::cout << z<<std::endl;
}
// Output: 12
*/

/*
#include <stdio.h>
#include <iostream>
using namespace std;
int main()
{
    int x = 5, y = 5, z;
    x = ++x;
    y = --y;
    z = x + ++x;
    cout << z;
    return 0;
}
// Output: 13
*/

/*
#include <stdio.h>
#include <iostream>
using namespace std;
int main()
{
    int x = 5, y = 5, z;
    x = ++x;
    y = --y;
    z = x++ + y--;
    cout << z;
    return 0;
}
// Output: 10
*/

/*
#include <stdio.h>
int main()
{
    int i = 10;
    printf("%d", ++(-i)); // ++(-i) is not valid
    printf("%d", -(--i));
    return 0;
}
// Output: 10
*/
