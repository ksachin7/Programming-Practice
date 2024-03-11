// #include <iostream>
// using namespace std;
// int main() {
// int array[] = {10, 20, 30};
// cout << -2[array]<<endl;
//     return 0;
// }
// Output: -30

// #include <iostream>
// #include <string>
// using namespace std;
// int main()
// {
//     cout<<is_array<int>::value; // case A
//     cout<<is_array<char[10]>::value; // case B
//     cout<<is_array<string>::value;  // case c
//     return 0;
// }
// Output: 010

// #include <iostream>
// using namespace std;
// class A{
// public:
//     A(){
//         cout<<"Constructor called\n";
//       }
//     ~A(){
//         cout<<"Destructor called\n";
//         }
// };
// int main(int argc, char const *argv[])
// {
//     A *a = new A[5];
//     delete[] a;
//     return 0;
// }
// Output:
// Constructor called
// Constructor called
// Constructor called
// Constructor called
// Constructor called
// Destructor called
// Destructor called
// Destructor called
// Destructor called
// Destructor called