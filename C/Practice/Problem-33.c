// TODO-6   what will be the output:
#include <stdio.h>
int main()
{
    // int arr[] = {1, 2, 3, 4, 5, 6};
    int arr[] = {11, 2, 3, 14, 5, 16};

    int i, j, k;
    j = ++arr[2]; // j=4
    printf("i=%d,j=%d k=%d\n", i, j, k);

    k = arr[1]++; // k= 2
    printf("i=%d,j=%d k=%d\n", i, j, k);

    i = arr[k++]; // i= 5 j=
    printf("i=%d,j=%d k=%d\n", i, j, k);

    return 0;
}
// Output: i=5,j=5 k=2
// j= ++arr[2] i.e. ++3 i.e 4
// k= arr[1]++ i.e. 2++ i.e 2 and will increment in next line
// i= arr[j++] i.e. arr[4++] i.e arr[4] i.e. 5 and j will increment and will become 5 in next line
