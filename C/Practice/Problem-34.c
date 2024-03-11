// TODO-7   what will be the output:
#include <stdio.h>
int main()
{
    int arr[6] = {1, 2, 3, 4, 5, 6};
    switch (sizeof(a))
    {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        printf("IIT KGP");
        break;
    }
    printf("IIT Madras");

    return 0;
}
// Output : error : use of undeclared identifier 'a'. As a is not declared.
