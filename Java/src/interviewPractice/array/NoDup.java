package interviewPractice.array;

import java.util.Arrays;

class NoDup {
    public static int removeDuplicates(int[] a, int n) {
        // If array size is 0 or 1, array is already sorted with no duplicates
        if (n == 0 || n == 1) {
            return n;
        }

        int j = 0; // Pointer to keep track of the position for unique elements

        // Iterate through the array up to the second-to-last element
        for (int i = 0; i < n - 1; i++) {
            // Compare current element with the next element
            if (a[i] != a[i + 1]) {
                // If different, copy the current element to position j and increment j
                a[j++] = a[i];
            }
        }

        // Copy the last element (which is definitely unique) to position j
        a[j++] = a[n - 1];

        // Return the new size of the array with duplicates removed
        return j;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6};
        int[] b = a.clone();
        int[] c = Arrays.copyOf(a, 10);
        System.out.println(Arrays.toString(c));

        int n = a.length;
        // the function will modify the array a[]
        // such that the starting j elements
        // will be having all unique elements

        int j = removeDuplicates(a, n);

        // printing array elements
        for (int i = 0; i < j; i++)
            System.out.print(a[i] + " ");
    }
}
