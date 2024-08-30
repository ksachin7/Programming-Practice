package interviewPractice.practice;

import java.util.List;
import java.util.TreeSet;

// Second largest number in array
class SecondLargest {
    public static void main(String[] args) {
        Integer[] arr = {2, -1, 4, 5, 5, 6, 6};

        TreeSet<Integer> ts = new TreeSet<>(List.of(arr));
        System.out.println(ts.toArray()[ts.size() - 2]);
    }
}
