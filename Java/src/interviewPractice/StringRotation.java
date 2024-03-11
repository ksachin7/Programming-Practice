package interviewPractice;

 class StringRotation {
    // Method to rotate a string to the left by a specified number of positions
    public static String rotateLeft(String input, int positions) {
        int length = input.length();
        positions %= length; // To handle positions greater than the string length

        // Splitting the string into left and right parts based on the rotation
        String leftPart = input.substring(0, positions);
        String rightPart = input.substring(positions);

        // Concatenating the right part with the left part to get the rotated string
        return rightPart + leftPart;
    }

    public static void main(String[] args) {
        String original = "HelloWorld";
        int rotateBy = 3;

        // Rotating the original string to the left by the specified number of positions
        String rotated = rotateLeft(original, rotateBy);

        // Displaying the original and rotated strings
        System.out.println("Original: " + original);
        System.out.println("Rotated: " + rotated);
    }
}

// -- another way --
 class ArrayRotation {
    // Method to reverse a portion of an array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Method to perform circular rotation of an array
    public static void circularRotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // To handle rotations greater than array length

        // Reverse the entire array
        reverse(arr, 0, n - 1);

        // Reverse the first 'k' elements
        reverse(arr, 0, k - 1);

        // Reverse the remaining elements
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int rotateBy = 2;

        // Perform circular rotation of the array by the specified number of positions
        circularRotateArray(array, rotateBy);

        // Display the rotated array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

/**Circular rotation of an array by K positions:**
 To find the circular rotation of an array by K positions:

 - Create a temporary array to store the rotated elements.
 - Copy the last K elements from the original array to the temporary array.
 - Shift the remaining elements in the original array to the right by K positions.
 - Copy the elements from the temporary array to the beginning of the original array.
 */
class CircularArrayRotation {
    // Method to perform circular rotation of an array
    public static void circularRotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // To handle rotations greater than array length

        int[] temp = new int[k]; // Temporary array to store rotated elements

        // Copy the last K elements from the original array to the temporary array
        for (int i = n - k, j = 0; i < n; i++, j++) {
            temp[j] = arr[i];
        }

        // Shift the remaining elements in the original array to the right by K positions
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }

        // Copy the elements from the temporary array to the beginning of the original array
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int rotateBy = 2;

        // Perform circular rotation of the array by the specified number of positions
        circularRotateArray(array, rotateBy);

        // Display the rotated array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

/* Given the relatively small string lengths of 5 and 15 characters, all three approaches should be acceptable in terms of memory usage.
 * The performance differences might not be significant, so you could choose the approach that aligns best with your code's readability and maintainability. */
