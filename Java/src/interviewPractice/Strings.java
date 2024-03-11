package interviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* String methods
    charAt()	Returns the character at the specified index (position)	char
    codePointAt()	Returns the Unicode of the character at the specified index	int
    compareTo()	Compares two strings lexicographically	int
    compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	int
    concat()	Appends a string to the end of another string	String
    contains()	Checks whether a string contains a sequence of characters	boolean
    contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
    copyValueOf()	Returns a String that represents the characters of the character array	String
    endsWith()	Checks whether a string ends with the specified character(s)	boolean
    equals()	Compares two strings. Returns true if the strings are equal, and false if not	boolean
    equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
    format()	Returns a formatted string using the specified locale, format string, and arguments	String
    getBytes()	Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array	byte[]
    getChars()	Copies characters from a string to an array of chars	void
    hashCode()	Returns the hash code of a string	int
    indexOf()	Returns the position of the first found occurrence of specified characters in a string	int
    isEmpty()	Checks whether a string is empty or not	boolean
    lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
    length()	Returns the length of a specified string	int
    matches()	Searches a string for a match against a regular expression, and returns the matches	boolean
    offsetByCodePoints()	Returns the index within this String that is offset from the given index by codePointOffset code points	int
    replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
    replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
    replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
    split()	Splits a string into an array of substrings	String[]
    startsWith()	Checks whether a string starts with specified characters	boolean
    subSequence()	Returns a new character sequence that is a subsequence of this sequence	CharSequence
    substring()	Returns a new string which is the substring of a specified string	String
    toCharArray()	Converts this string to a new character array	char[]
    toLowerCase()	Converts a string to lower case letters	String
    toString()	Returns the value of a String object	String
    toUpperCase()	Converts a string to upper case letters	String
    trim()	Removes whitespace from both ends of a string	String
    valueOf()	Returns the string representation of the specified value	String
 */

public class Strings {

    private static final char[] chars = {'c', 'd', 'd'};

    public static void main(String[] args) {
        String str = "Hey...";
        String str2 = "Hello java";
        String str3 = "";
        String str4 = " hEy ...  ";
        String str5 = "hey hey";
        String st = "New String";

        // String methods
        System.out.println(str.equalsIgnoreCase(str4));
        System.out.println(str.toLowerCase() + str.toUpperCase());

        String formattedString = String.format("%s", str4);
        System.out.println(formattedString);

        System.out.println(str.indexOf("."));
        System.out.println(str2.hashCode());

        System.out.println(str2.replace("lo", "ooo"));
        System.out.println(str4.replaceFirst("E", "e"));
        System.out.println(str4.replaceAll("\\.", "+"));

        System.out.println(str5.subSequence(0, 4));
        System.out.println(str5.substring(1, 5));

        str3 = String.copyValueOf(chars);
        System.out.println(str3);
        System.out.println(String.valueOf(chars, 1, 2));
        System.out.println(String.copyValueOf(chars, 1, 2));

        System.out.println(str4.trim());
        System.out.println(Arrays.toString(str2.split(" ")));
        System.out.println(str.concat(str2));

        System.out.println(str.contains("ey"));
        System.out.println(str.startsWith("H"));

//       Returns: An int value: 0 if the string is equal to the other string.
//                < 0 if the string is lexicographically less than the other string
//                > 0 if the string is lexicographically greater than the other string (more characters)
        System.out.println(str.compareTo(str4));
    }
}


// find all permutations
// P(n,r) = n!/(n-r)!
// permutation With Repeatation

class Permutation {
    static void permuteRepeatable(String str, String newStr) {
        if (newStr.length() == str.length()) {
            System.out.println(newStr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.println(" - " + newStr);
            permuteRepeatable(str, newStr + str.charAt(i));
        }
    }

    static void permuteNonRepeatable(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
            return;
        }
        for (int i = 1; i <= r; i++) {
            str = swap(str, l, i);
            permuteNonRepeatable(str, l + 1, r);
            str = swap(str, l, i);
        }
    }

    static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();

        // swapping chars
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }

    static void permuteNonRecursive(String str, String pstr) {
        if (str.length() == 0) {
            System.out.println(pstr + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String leftSubStr = str.substring(0, i);
            String rightSubStr = str.substring(i + 1);
            String rest = leftSubStr + rightSubStr;
            permuteNonRecursive(rest, pstr + ch);
        }
    }

    public static void main(String[] args) {
//        permuteRepeatable("PQRs", "");

//        String string="abc";
//        permuteNonRepeatable(string, 0, string.length()-1);

        Scanner scan = new Scanner(System.in);
        String s;
        String answer = "";

        System.out.print("Enter the string : ");
        s = scan.next();

        System.out.print("\nAll possible strings are : ");
        permuteNonRecursive(s, answer);
    }
}

// write a program to concat two arraylist if we are having first arraylist of 5 students firstname and then second arraylist of having
// five student lastname.then how we can concat first student firstname and lastname and others also.
class ConcatArrayList {

    public static void main(String[] args) {

        ArrayList<String> fname = new ArrayList<String>();
        ArrayList<String> lname = new ArrayList<String>();
        fname.add("shweta");
        fname.add("kriti");
        fname.add("Aditya");
        fname.add("sumit");
        fname.add("shipra");
        fname.add("satya");
        lname.add("vikram");
        lname.add("sia");
        lname.add("harsh");
        lname.add("justin");
        lname.add("bts");
        lname.add("selena");
        System.out.println("FirstNames:" + fname);
        System.out.println("LastNames:" + lname);
        int len = fname.size();
        ArrayList<String> fullName = new ArrayList<String>();
        for (int i = 0; i < len; i++) {
            fullName.add(fname.get(i) + " " + lname.get(i));
        }
        System.out.println("FullNames:" + fullName);

    }

}

// Write a program to reverse a String contents.
class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            System.err.print(ch[i]);
        }
    }
}


// write a program to check anagram of string.
class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len1 = str.length();
        String str2 = sc.nextLine();
        int len2 = str2.length();
        if (len1 != len2)
            System.out.println("Strings are not anagram");
        else {
            char[] arr1 = str.toLowerCase().toCharArray();
            char[] arr2 = str2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Strings are anagrams");
            } else {
                System.out.println("Strings are not anagram");
            }
        }
    }

}

// StringBuilder
class StringBuilderPractice {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("  Hello  ");
        StringBuilder s2 = new StringBuilder(" Builder ");

        System.out.println(s1.append(s2));
        System.out.println(s1.reverse());
        System.out.println(s2.length());
        System.out.println(s1.delete(1, 3));
        System.out.println(s1.replace(0, 1, "+"));
        System.out.println(s1.capacity());

        s2.setLength(5);
        System.out.println(s2);

        s1.trimToSize();    // reduces storage used for char sequence
        System.out.println(s1);
    }
}


// Strings Concatenation
//StringBuilder is the most popular and fastest way to concatenate strings in Java.
class StringConcatenation {

    static String concatStrings(String str1, String str2) {
        StringBuilder s1 = new StringBuilder(str1);

        StringBuilder str = s1.append(str2);
        return str.toString();
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Java";

        System.out.println(str1 + str2);  // it creates another concatenated string
        System.out.println(str1.concat(str2));
        System.out.println(concatStrings(str1, str2));
    }
}

// reverse words of a string
class ReverseWords {

    public static void main(String[] args) {
        String[] s = "i like this program very much".
                split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i] + " ";
        }
        System.out.println("Reversed String:");
        System.out.println(ans);
    }
}

// remove spaces
class RemoveSpaces {

    static String rmSpaces(String str) {
        char[] chArray = str.toCharArray();
        String st = "";
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == ' ')
                continue;
            st += chArray[i];
        }
        return st;
    }

    public static void main(String[] args) {
        String str = "davb avsb avsb";

//      method-1
        System.out.println(str.replace(" ", ""));

//      method-2
        System.out.println(rmSpaces(" sdbvk asjb vdsk   "));
    }
}

// To find and count special characters in a string,
//Here, we'll consider special characters to be any character that is not an alphabet (a-z or A-Z), a digit (0-9), or a space.
class SpecialCharacterCounter {

    public static int countSpecialCharacters(String inputString) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "Hello, world! How are you? #123";
        int specialCharCount = countSpecialCharacters(input);
        System.out.println("Number of special characters in the string: " + specialCharCount);
    }
}

/**
 * To check if one string is a rotation of another string, you can follow these steps:
 * Concatenate the first string with itself, creating a new string.
 * Check if the second string is a substring of the new string.
 **/
class StringRotationCheck {

    // Function to check if one string is a rotation of another
    public static boolean isRotation(String s1, String s2) {
        // Check if the lengths of both strings are equal and non-empty
        if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        // Concatenate the first string with itself
        String concatenatedString = s1 + s1;

        // Check if the second string is a substring of the concatenated string
        return concatenatedString.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        if (isRotation(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is NOT a rotation of " + s1);
        }
    }
}
