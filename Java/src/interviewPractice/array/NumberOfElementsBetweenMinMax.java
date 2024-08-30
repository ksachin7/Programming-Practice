package interviewPractice.array;

import java.util.Arrays;

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
