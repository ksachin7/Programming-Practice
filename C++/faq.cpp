//!?* C++ programs are frequently asked in the interview.

//? Fibonacci Series:
#include <iostream>
using namespace std;
void Fibonacci(int n);

int main()
{
    int n;
    cout << "Enter the no. : " << endl;
    cin >> n;
    cout << "0 1 ";
    Fibonacci(n - 2);
    return 0;
}
void Fibonacci(int n)
{
    static int n1 = 0, n2 = 1, n3;
    if (n > 0)
    {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        cout << n3 << " ";
        Fibonacci(n - 1);
    }
}
//? Program for K Most Recently Used (MRU) Apps:
// The task is to print the contents of the array when the user using the system presses Alt + Tab exactly K number of times.
// Note that after pressing Alt + Tab key, app opening pointer will move through apps from 0th index towards right,
// depending upon the number of presses, so the app on which the press ends will shift to 0th index, because that will become the most recently opened app.
// C++ implementation of the approach
// C++ implementation of the approach
#include <iostream>
using namespace std;

// Function to update the array in most recently used fashion
void mostRecentlyUsedApps(int *arr, int N, int K)
{
    int app_index = 0;

    // Finding the end index after K presses
    app_index = (K % N);

    // Shifting elements by 1 towards the found index on which the K press ends
    int app_id = arr[app_index];
    for (int i = app_index; i > 0; i--)
    {
        arr[i] = arr[i - 1];
    }

    // Update the current active app
    arr[0] = app_id;
}

// Utility function to print the contents of the array
void printArray(int *arr, int N)
{
    for (int i = 0; i < N; i++)
        cout << arr[i] << " ";
}

// Driver code
int main()
{
    int K = 3;
    int arr[] = {3, 5, 2, 4, 1};
    int N = sizeof(arr) / sizeof(arr[0]); // size of array(5*4)= 20
    mostRecentlyUsedApps(arr, N, K);
    printArray(arr, N);
    return 0;
}

//? Segregate Even and Odd numbers:
// A Lomuto partition based scheme to segregate
// even and odd numbers.
#include <iostream>
using namespace std;

// Function to rearrange the array in given way.
void rearrangeEvenAndOdd(int arr[], int n)
{
    // Variables
    int j = -1;

    // Quick sort method
    for (int i = 0; i < n; i++)
    {

        // If array of element
        // is odd then swap
        if (arr[i] % 2 == 0)
        {

            // increment j by one
            j++;

            // swap the element
            swap(arr[i], arr[j]);
        }
    }
}

int main()
{
    int arr[] = {12, 10, 9, 45, 2, 10, 10, 45};
    int n = sizeof(arr) / sizeof(arr[0]);

    rearrangeEvenAndOdd(arr, n);

    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
}
// This code is contributed by devagarwalmnnit
