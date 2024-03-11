#include <iostream>

int main()
{
    int value = 42;
    int *ptr1 = &value; // Pointer to an integer

    int **ptr2 = &ptr1; // Pointer to a pointer to an integer

    // Accessing value using nested pointers
    std::cout << "Value: " << **ptr2 << std::endl;

    // Changing the value using nested pointers
    **ptr2 = 100;
    std::cout << "Updated Value: " << value << std::endl;

    return 0;
}
