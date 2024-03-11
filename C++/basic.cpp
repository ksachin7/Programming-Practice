#include <iostream>
#include <cstring>
#include <string.h>
// #include <bits/stdc++.h>
using namespace std;

int n;
string name;

//! Array Declaration:
float arr[] = {1.1, 3.4, 5.6, 6.75};
int num[11] = {5, 2, 5, 7, 3, 1};

double cube(double n);
void sayHi(string name);

int main()
{

#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif

    //! Array:
    cout << arr << endl; // this will not work use loop to print full array.
    cout << arr[1] << endl;
    cout << num[3] << endl;
    num[3] = 9;
    cout << num[3] << endl;
    num[9] = 11;
    cout << num[9] << endl;
    // cout < num[10] << endl;      //error: reference to overloaded function could not be resolved;
    cout << num[7] << endl; //will not cause any error and print 0;
    // cout << num[11] << endl;     //will cause error

    //! input:
    cout << "Enter a number" << endl;
    cin >> n;
    cout << "You Entered: " << n << endl;

    cout << "Enter your name:" << endl;

    cin >> name;
    cout << "Hello " << name << endl;

    cin.ignore();       // use if you're using cin before otherwise getline() will not work.
    getline(cin, name); // to take a string or full line of input
    cout << "Printing full name: " << name << endl;

    //! calling function:
    cout << cube(5) << endl;
    cout << cube(3.6) << endl;

    sayHi("Sachin");

    return 0;
}

//! function:
void sayHi(string name)
{
    cout << "Hey " << name << endl;
}

double cube(double n)
{
    return n * n * n;
}

//! ------------------------------------------ Exception Handling: ---------------------------------------------
