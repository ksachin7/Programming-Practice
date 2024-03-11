package interviewPractice;
/**
 * This class demonstrates different methods of comparing strings.
 * The intern() method is typically used to add strings to the string pool and return a canonical representation of the string.
 */

public class StringComparisonExample {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";
        String str4 = new String("apple");
        String str5 = str4.intern(); // Interning the string

        // Using == operator for reference comparison
        System.out.println("Using == operator:");
        System.out.println("str1 == str2: " + (str1 == str2));  // false
        System.out.println("str1 == str3: " + (str1 == str3));  // true
        System.out.println("str1 == str4: " + (str1 == str4));  // false
        System.out.println("str1 == str5: " + (str1 == str5));  // true
        System.out.println();

        // Using equals() method for content comparison
        System.out.println("Using equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));  // false
        System.out.println("str1.equals(str3): " + str1.equals(str3));  // true
        System.out.println("str1.equals(str4): " + str1.equals(str4));  // true
        System.out.println("str1.equals(str5): " + str1.equals(str5));  // true
        System.out.println();

        // Using equalsIgnoreCase() method for case-insensitive comparison
        System.out.println("Using equalsIgnoreCase() method:");
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));  // false
        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));  // true
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4));  // true
        System.out.println("str1.equalsIgnoreCase(str5): " + str1.equalsIgnoreCase(str5));  // true
        System.out.println();

        // Using compareTo() method for lexicographic comparison
        /*
           In lexicographic comparison, the compareTo() method returns:
           A negative value if the invoking string is lexicographically before the string argument.
           Zero if the strings are lexicographically equal.
           A positive value if the invoking string is lexicographically after the string argument.
        */
        System.out.println("Using compareTo() method:");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));  //-1 negative value
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));  // 0
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4));  // 0
        System.out.println("str1.compareTo(str5): " + str1.compareTo(str5));  // 0

        // StringBuilder and StringBuffer comparisons
        StringBuilder stringBuilder1 = new StringBuilder("hello");
        StringBuilder stringBuilder2 = new StringBuilder("world");
        StringBuilder stringBuilder3 = new StringBuilder("hello");

        StringBuffer stringBuffer1 = new StringBuffer("hello");
        StringBuffer stringBuffer2 = new StringBuffer("world");
        StringBuffer stringBuffer3 = new StringBuffer("hello");

        // Using equals() method for content comparison
        System.out.println("Using equals() method with StringBuilder and StringBuffer:");

        System.out.println("stringBuilder1.equals(stringBuilder2): " + stringBuilder1.equals(stringBuilder2));  // false
        System.out.println("stringBuilder1.equals(stringBuilder3): " + stringBuilder1.equals(stringBuilder3));  // false

        System.out.println("stringBuffer1.equals(stringBuffer2): " + stringBuffer1.equals(stringBuffer2));  // false
        System.out.println("stringBuffer1.equals(stringBuffer3): " + stringBuffer1.equals(stringBuffer3));  // false
    }
}

/*
 * == looks at identity
 * equals looks at content
 * compareTo looks at order.

    Here's a breakdown of the differences:
    == Operator:
    Used to compare primitive data types for equality.
    Used to compare object references (memory addresses) to check if they point to the same object in memory.
    Does not necessarily compare the contents or values of objects.

    compareTo Method:
    Used to compare objects that implement the Comparable interface.
    Typically used for sorting collections of objects.
    Returns a negative integer, zero, or a positive integer depending on whether the calling object is less than, equal to, or greater than the object being compared to.
    Compares the actual content or values of objects, as defined by the implementation of the compareTo method.
 */