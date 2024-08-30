package interviewPractice.practice;

import java.util.HashSet;

// COUPA Interview Questions
// Given an array, remove all duplicates except the first occurrence.
// Input:  [3,2,4,5,1,7,3,5,2,3,9]
// Output: [3,2,4,5,1,7,9]
class noDups {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1, 7, 3, 5, 2, 3, 9};
        HashSet<Integer> newhs = new HashSet<>();
        for (int e : arr) {
            newhs.add(e);
            System.out.println(newhs);
        }
        System.out.println(newhs);
    }
}
