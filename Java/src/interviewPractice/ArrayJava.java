package interviewPractice;

import java.util.*;

public class ArrayJava {
/**    If you're concerned about performance and memory, the removeDuplicatesUsingCollection method with the HashSet approach is generally more efficient, especially if the input array is relatively large and the order needs to be preserved. However, if memory usage is a concern and modifying the original array is acceptable, the removeDuplicates method might be preferred, as it doesn't require creating a new HashSet. */
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


class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
//        int arr[] = {1,5,7,8,5,1,2,8,5,4,9,7,7,2};
        int[] arr = {-2, -1, 2, -2, 3, 4, 4, -1, -2, 5, 7, 6};
        ArrayList<Integer> nodupe = new ArrayList<>();

        Arrays.sort(arr);  // Any order of Logn Sorting Method Merge Sort or Quick Sort

        int curr = -1;
        for (int i = 0; i < arr.length; i++) {
            if (nodupe.size() == 0) {
                nodupe.add(arr[i]);
                curr = arr[i];
            } else {
                if (arr[i] != curr) {
                    nodupe.add(arr[i]);
                    curr = arr[i];
                }
            }

        }


        System.out.println("Array " + nodupe);
    }
}


// Java Program to Remove Duplicate Elements
// From the Array using extra space

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

// Finding the number of elements between min and max number in an array?
class NumberOfElementsBetweenMinMax {

    static int[] sort(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    static int numbersBetweenMinMax(int[] arr, int min, int max) {
        NumberOfElementsBetweenMinMax.sort(arr);
        int count = 0;
        int minIndex = Arrays.binarySearch(arr, min);
        int maxIndex = Arrays.binarySearch(arr, max);

        count = maxIndex - minIndex - 1;
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 4, 5, 6};
        int[] sorted = NumberOfElementsBetweenMinMax.sort(arr);
        System.out.println(Arrays.toString(sorted));

        System.out.println(NumberOfElementsBetweenMinMax.numbersBetweenMinMax(arr, 5, 7));
    }
}


class ArrayPractice {
    public static void main(String[] args) {
        int[][] arr = {{0, 3, 5}, {1}};
        int[][] arr1 = new int[][]{{0, 3, 5, 2, 5, 3}, {1, 3, 4, 5}};

        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepHashCode(arr1));


        int[] arr0 = {5, 7, 6, 6, 3};
        int[] arrr = {5, 7, 6, 4, 3};
        Integer[] arr2 = new Integer[]{5, 7, 6, 6, 3};

        // compare() returns -1 in output when arr0 is lexicographically less than arrr.
        // compare() returns 1 in output when arr0 is lexicographically greater than arrr.
        // compare() returns 0 in output when arr0 is equal to arrr in size and has elements.
        System.out.println(Arrays.compare(arr0, arrr));

        System.out.println(Arrays.mismatch(arr0, arrr));    // returning index: 3
        Arrays.sort(arr0, 3, 5);    // Sorts the specified range of array in ascending order.
        System.out.println(Arrays.toString(arr0));

        System.out.println(Arrays.toString(Arrays.copyOf(arr0, 4)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr0, 1, 3)));

        System.out.println(Arrays.asList(2, 4, 5, 3, 7));
        System.out.println(List.of(arr0));  // [[I@2f92e0f4] List.of() requires an Integer array not an int array

        Integer[] array = new Integer[]{1, 2, 3};
        List<Integer> list = Arrays.asList(array);
        System.out.println(list);
        array[0] = 1000;
        System.out.println(list);

        // List.of() doesn't allow null values and it creates immutable array
        String[] str = new String[]{"one", "two", "three"};
        List<String> list1 = List.of(str);
        System.out.println(list1);
        str[0] = "thousand";
        System.out.println(list1);

        System.out.println("arr2: " + Arrays.hashCode(arr2) + "\t arr0: " + Arrays.hashCode(arr0));
        System.out.println(Arrays.equals(arr0, arrr));
        System.out.println(Arrays.binarySearch(arr0, 6));
        System.out.println(Arrays.spliterator(arrr));

        Boolean[] bools = new Boolean[]{true, false, true, true};
    }
}
