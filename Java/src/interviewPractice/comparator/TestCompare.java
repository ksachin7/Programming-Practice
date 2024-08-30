package interviewPractice.comparator;

import interviewPractice.namePhoneComparator;

import java.util.ArrayList;
import java.util.Collections;

class TestCompare {
    public static void main(String[] args) {
        ArrayList<Compare> al = new ArrayList<>();

        al.add(new Compare("xyz", 1234, 3));
        al.add(new Compare("abc", 543, 2));
        al.add(new Compare("aac", 523, 1));
        al.add(new Compare("aacc", 5233, 4));

        System.out.println(al);
//        Collections.sort(al);
        Collections.sort(al, new IdComparator());
        System.out.println(al);

//        al.sort(Comparator.comparing(String::toString));

        // using List.sort()
        al.sort(new namePhoneComparator());
        System.out.println(al);
    }
}
