package interviewPractice.practiced_programs;

import java.util.Scanner;

class AllOccurrence {
    public static void patIndex(String str, String pat) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                // i -> starting point of substring, j-> ending point of substring
                String sub = str.substring(i, j);
                if (str.substring(i, j).equals(pat))
                    System.out.println(str.indexOf(pat, i++));
            }
        }
    }

    public static void main(String[] args) {
        String pat = "AABA";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String with sub-string palindrome: ");
        String str = s.nextLine();
        patIndex(str, pat);
    }
}
