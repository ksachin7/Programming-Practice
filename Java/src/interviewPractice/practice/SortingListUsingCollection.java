package interviewPractice.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

// Sort List of Strings alphabetically
class SortingListUsingCollection {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("xyz");
        al.add("abc");
        al.add("mno");
        al.add("pqr");
        al.add("oop");
//        al.add(5);
//        al.add(2);

        // printing original list
        System.out.println(al);

        // soting using collections.sort()
        Collections.sort(al);
        System.out.println(al);

        // sorting by converting to TreeSet
        TreeSet<String> ts = new TreeSet<>(al);
        System.out.println("Sorted List: " + ts);
    }
}
