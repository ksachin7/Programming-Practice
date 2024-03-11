#include <iostream>

int main()
{
    // Clear the terminal screen
    std::cout << "\x1B[2J\x1B[H";

    int value = 42;        // Declare an integer variable
    int *pointer = &value; // Declare a pointer and assign the address of 'value'

    // Print the value and memory address
    std::cout << "Value: " << value << std::endl;
    std::cout << "Memory Address of 'value': " << pointer << std::endl;

    // Access the value indirectly using the pointer
    *pointer = 100;

    // Print the updated value
    std::cout << "Updated Value: " << value << std::endl;

    // Pointer arithmetic
    int numbers[] = {1, 2, 3, 4, 5};
    int *num_ptr = numbers;

    // Access elements using pointer arithmetic
    std::cout << "Third element: " << *(num_ptr + 2) << std::endl;

    // Arrays and pointers
    int array[] = {10, 20, 30, 40, 50};
    int *array_ptr = array;

    // Loop through the array using a pointer
    for (int i = 0; i < 5; i++)
    {
        std::cout << "Element " << i << ": " << *array_ptr << std::endl;
        array_ptr++; // Move the pointer to the next element
    }

    return 0;
}
