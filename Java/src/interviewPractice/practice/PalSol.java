package interviewPractice.practice;

import java.util.HashMap;
import java.util.Map;

// check palindrome for each element in the array and print it infront of that number
class PalSol {

    static void printMap(HashMap<Integer, Boolean> map) {
        System.out.print("Palindrome: [ ");
        for (Map.Entry<Integer, Boolean> e : map.entrySet()) {
            System.out.print(e.getKey() + ":" + e.getValue() + " ");
        }
        System.out.print("]");
    }

    static void checkPalindrome(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i], sum = 0;
            boolean result = false;

            while (tmp > 0) {
                int r = tmp % 10;
                sum = 10 * sum + r;
                tmp /= 10;
            }
            if (sum == arr[i])
                result = true;

            map.put(arr[i], result);
        }
        printMap(map);
    }

    public static void main(String[] args) {
        int[] arr = {201, 111, 101, 123};
        checkPalindrome(arr);
    }
}
