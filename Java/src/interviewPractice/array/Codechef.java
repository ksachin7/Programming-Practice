package interviewPractice.array;

import java.util.ArrayList;
import java.util.Arrays;

class Codechef {
    public static void main(String[] args) throws Exception {
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
