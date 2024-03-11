#include <iostream>
#include <string.h>

int main(int argc, char const *argv[])
{
    int array[] = {1, 2, 3};
    std::string strings[] = {"12345", "abc", "xyz"};
    char str[] = "Hello world";

    for (int arr : array)
    {
        std::cout << arr << " ";
    }

    std::cout << std::endl
              << str
              << std::endl;

    for (std::string s : strings)
    {
        std::cout << s + " ";
    }

    std::cout << std::endl
              << argc << argv
              << std::endl;

    return 0;
}
