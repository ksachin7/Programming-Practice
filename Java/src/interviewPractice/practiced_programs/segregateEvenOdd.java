package interviewPractice.practiced_programs;

import java.util.Arrays;

// segregate even-odd elements
class segregateEvenOdd {
    static void seg(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {

            while (arr[i] % 2 == 0 && i < j)
                i++;
            while (arr[j] % 2 != 0 && i < j)
                j--;

            // swapping elements
            int tmp;
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
//        int[] arr= {1,2,3,4,5,6,7};
        int arr[] = {12, 34, 45, 9, 8, 90, 3};

        seg(arr);
    }
}
