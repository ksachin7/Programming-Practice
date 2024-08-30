package interviewPractice.practice;

import java.util.ArrayList;
import java.util.Arrays;

// Convert An ArrayList To Array In Java With Example
class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("xyz");
        al.add("abc");
        al.add("mno");
        al.add("pqr");
        al.add("oop");

        // method-1
        String[] str = new String[al.size()];
        for (int i = 0; i < al.size(); i++) {
            str[i] = al.get(i);
        }

        // printing array
        for (String string : str) {
            System.out.print(string + " ");
        }

        // method-2
        String[] str1 = al.toArray(new String[al.size()]);
        System.out.println("\n" + Arrays.toString(str1));

        // method-3
        String[] str2 = Arrays.copyOf(al.toArray(), al.size(), String[].class);
        System.out.println(Arrays.toString(str2));

        // method-4
        System.out.println(Arrays.toString(al.toArray()));
    }
}
