// 2. Write a program to demonstrate bitwise operators.
#include <stdio.h>
int main()
{
    char i = 5, j = 6;
    // taking char data type because char is smallest group of bits (i.e. 8) allow us to work with.
    // i = 5 and j = 6 will represented as its binary form of 8-bits.

    printf("%d & %d = %d\n", i, j, i & j); // bitwise &(and) operator takes two operand and does binary AND operation on every bits.
    printf("%d | %d = %d\n", i, j, i | j); // bitwise |(or) operator takes two operand and does binary OR operation on every bits.
    printf("%d ^ %d = %d\n", i, j, i ^ j); // bitwise ^(exclusive OR) operator takes two operand and does binary XOR operation on every bits.
    printf("~%d = %d\n", j, ~j);           // bitwise ~(complement) operator takes one operand and does one's complement operation i.e. it converts bit 1 to 0 and 0 to 1.
    printf("%d << 1 = %d\n", i, i << 1);   // bitwise <<(left shift) shifts bit to left. The number right after the operator decide how much bit to shift. Also Output= i*2^1.
    printf("%d >> 2 = %d\n", i, i >> 2);   // bitwise >>(right shift) shifts bit to right. The number right after the operator decide how much bit to shift. Also Output= i/2^2.

    return 0;
}