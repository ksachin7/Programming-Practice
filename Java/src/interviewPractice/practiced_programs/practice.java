package interviewPractice.practiced_programs;
import java.util.*;

// Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function search(char pat[], char txt[]) that prints all occurrences of pat[] in
// txt[]. You may assume that n > m.
// COUPA Interview Questions

// Examples:
// Input:
// txt[] = "THIS IS A TEST TEXT"
// pat(] = "TEST"
// Output:
// Pattern found at index 10

// Input: txt[] = "AABAACAADAABAABA"
// pat[] = "AABA"
// Output:
// Pattern found at index 0
// Pattern found at index 9
// Pattern found at index 12
// "AAAA"

/*
* Problem: You have a sorted int array write a function that returns a sorted array containing square of those numbers
* Solution: Since the square would be larger either of leftmost negative or the rightmost positive number hence we will check/compare
*           absolute value of both the leftmost and the rightmost element and put the square of the largest element in the array.
*/
public class practice {
     int[] sortedArray(int[] arr, int n){
         int[] sorted = new int[n];
         int left=0, right=0;
        for (int i = 0; i <= n-1; i++) {
            if ( Math.abs(arr[left]) > Math.abs(arr[n-1-right])) {
                sorted[i] = arr[left]*arr[left];
                left++;
            }
            else {
                sorted[i] = arr[n - 1 - right]*arr[n-1-right];
                right++;
            }

        }
        return sorted;
    }
    public static void main(String[] args) {
        practice pr= new practice();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = s.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i]= s.nextInt();
        }
        System.out.println(Arrays.toString(pr.sortedArray(arr, n)));
        System.out.println(Arrays.binarySearch(arr,5));
    }
}

// find most repeated word


//


// Recursive java program to
// find sum of digits of a number

//  The Time Complexity : O(sqrt(n)) and the Space Complexity : O(1)

// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.


