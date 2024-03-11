// TODO-16 what will be the output of following code
#include <stdio.h>
float func(float age[]);
int main()
{
    float result, age[] = {23.4, 55, 22.6, 3, 40.5, 18};
    result = func(age);
    printf("%0.2f", result);
    return 0;
}

float func(float age[])
{
    int i;
    float result, sum = 0.0;
    for (i = 0; i < 6; ++i)
        sum += age[i];
    printf("%0.3f", sum);

    result = (sum / 6);
    return result;
}
// Output: 27.08
// Explanation: func(age) --> 162.50/6 --> 27.08
// func() is taking the array summing up the values and returning sum/6 i.e. 27.08
