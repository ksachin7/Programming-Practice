package interviewPractice.array;

import java.util.*;

public class ArrayJava {
/** 
 * If you're concerned about performance and memory, the removeDuplicatesUsingCollection method with the HashSet
 *  approach is generally more efficient, especially if the input array is relatively large and the order needs to be
 *  preserved. However, if memory usage is a concern and modifying the original array is acceptable, the removeDuplicates
 *  method might be preferred, as it doesn't require creating a new HashSet. 
 */
    public static int[] removeDuplicatesUsingCollection(int[] arr) {
        if (arr.length <= 1) {
            return arr;  // No duplicates to remove
        }

        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }

    public static int[] removeDuplicates(int[] a) {
        int n = a.length;
        // If array size is 0 or 1, array is already sorted with no duplicates
        if (n <= 1) {
            return a;
        }

        // Sort the array before removing duplicates
        Arrays.sort(a);

        int j = 0; // Pointer to keep track of the position for unique elements

        // Iterate through the entire array up to the second-to-last element
        for (int i = 0; i < n - 1; i++) {
            // If the current element is different from the next element, copy it to position j and increment j
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }

        // Copy the last element to the end, if it's unique
        a[j++] = a[n - 1];

        // Create a new array with the size of unique elements using Arrays.copyOf
        return Arrays.copyOf(a, j);
    }

    // modifies the original array
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // will not modify original array
    public static int[] reverse(int[] arr) {
        int[] arr1 = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[j++] = arr[i];
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 1, 2, 5, 7, 7, 7, 6, 6};
        int[] arr1 = {2, 4, 6, 8, 4, 10, 2, 12, 14, 6};

        int[] uniqueArray = removeDuplicatesUsingCollection(arr);
        System.out.println(Arrays.toString(uniqueArray));

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        int[] reversed= reverse(arr);
        System.out.println(Arrays.toString(reversed));

        int[] uniqueElements = removeDuplicates(arr1);
        System.out.println(Arrays.toString(uniqueElements));
    }
}


// Java Program to Remove Duplicate Elements
// From the Array using extra space


