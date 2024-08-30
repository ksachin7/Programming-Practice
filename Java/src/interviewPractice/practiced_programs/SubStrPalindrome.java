package interviewPractice.practiced_programs;

import java.util.Scanner;

// Given a string, write a program to find the starting and ending index of subset of the string which is palindrome.
// COUPA Interview Questions
class SubStrPalindrome {
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void palIndex(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                // i -> starting point of substring, j-> ending point of substring
                String sub = str.substring(i, j);
                if (isPalindrome(sub) && sub.length() > 1) {
                    System.out.println("Start index of " + sub + ": " + str.indexOf(sub) + " and Ending index " + (str.indexOf(sub) + sub.length() - 1));
//                    System.out.println(str.substring(i, j));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String with sub-string palindrome: ");
        String str = s.nextLine();
        palIndex(str);
    }
}
