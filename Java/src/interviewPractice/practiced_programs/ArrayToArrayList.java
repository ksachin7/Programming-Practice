package interviewPractice.practiced_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Convert An Array To ArrayList In Java With Example
class ArrayToArrayList {
    public static void main(String[] args) {
        String[] arr = {"abc", "xyz", "pqr"};

        // method-1
        ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
        System.out.println(al);

        // method-2
        ArrayList<String> alist = new ArrayList<>();
        for (String e : arr) {
            alist.add(e);
        }

        System.out.println(alist);

        // method-3
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, arr);
        System.out.println(list);
    }
}
