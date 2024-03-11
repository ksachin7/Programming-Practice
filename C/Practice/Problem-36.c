// TODO-9   what will be the output:
#include <stdio.h>
int main()
{
    int arr[5] = {1, 2, 3, 4, 5};
    int a;
    arr[1] = ++arr[1]; // 3
    a = arr[1]++;      // 3
    arr[1] = arr[a++]; // 4

    printf("%d%d", a, arr[1]);
    return 0;
}
// Output: 44
// arr[1] is preincremented and become 3. a is assigned to arr[1]++ i.e a= 3 and again arr[1] is assigned to arr[a++] i.e arr[3] i.e 4 so printed 4 4
