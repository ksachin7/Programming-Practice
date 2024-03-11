package interviewPractice;
import java.util.*;

public class ImportantPrograms {
    // Reverse a number
    static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num = num / 10;
        }
        return reversedNum;
    }

    // reverse the words of a string
    /**
    Original String: Hello World Java Programming -->
    Reversed Words: Programming Java World Hello
     */
    static String reverseWords(String str) {
        // Split the input string into words using space as delimiter
        String[] words = str.split("\\s+");

        // Reverse the order of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        // Remove the trailing space and return the reversed string
        return reversed.toString().trim();
    }

    /**
     Original String: Hello World Java Programming -->
     Reversed Words: olleH dlroW avaJ gnimmargorP
     */
    static String reverseWordsInPosition(String str) {
        String[] words = str.split("\\s+");

        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder wordBuilder = new StringBuilder(word);
            wordBuilder.reverse();
            reversed.append(wordBuilder).append(" ");
        }

        return reversed.toString().trim();
    }

    // Fibonacci series up to the nth term
    static void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        System.out.print(first + " ");
        for (int i = 2; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    // Greatest Common Divisor (GCD)
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    // Perfect number
    static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    // Anagram
    static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    // Palindrome
    static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Frequency of characters in a string
    static Map<Character, Integer> calculateCharacterFrequency(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        return freq;
    }

    // Leap year
    static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // Non-repeating characters in a string
    static List<Character> findNonRepeatingCharacters(String str) {
        Map<Character, Integer> freq = calculateCharacterFrequency(str);
        List<Character> nonRepeatingChars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            if (freq.get(ch) == 1) {
                nonRepeatingChars.add(ch);
            }
        }
        return nonRepeatingChars;
    }

    // Replace substring in a string
    static String replaceSubstring(String originalString, String substringToReplace, String replacementString) {
        int startIndex = originalString.indexOf(substringToReplace);
        if (startIndex != -1) {
            int endIndex = startIndex + substringToReplace.length();
            String part1 = originalString.substring(0, startIndex);
            String part2 = originalString.substring(endIndex);
            return part1 + replacementString + part2;
        }
        return originalString;
    }

    // Replace array elements by their ranks
    static void replaceByRank(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        Map<Integer, Integer> ranks = new HashMap<>();
        for (int i = 0; i < sortedArr.length; i++) {
            ranks.put(sortedArr[i], i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ranks.get(arr[i]);
        }
    }

    // Non-repeating elements in an array
    static List<Integer> findNonRepeatingElements(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer> nonRepeatingElements = new ArrayList<>();
        for (int num : arr) {
            if (freq.get(num) == 1) {
                nonRepeatingElements.add(num);
            }
        }
        return nonRepeatingElements;
    }

    // Longest palindrome
    static String findLongestPalindrome(String str) {
        String longestPalindrome = "";
        for (int i = 0; i < str.length(); i++) {
            String palindromeOdd = expandFromCenter(str, i, i);
            String palindromeEven = expandFromCenter(str, i, i + 1);
            longestPalindrome = longestPalindrome.length() >= palindromeOdd.length() ? longestPalindrome : palindromeOdd;
            longestPalindrome = longestPalindrome.length() >= palindromeEven.length() ? longestPalindrome : palindromeEven;
        }
        return longestPalindrome;
    }

    // Helper function to expand palindrome from center
    static String expandFromCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }

    // Factorial of a number
    static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    static int factorialRecursive(int n) {
        // Base case: factorial of 0 and 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    // Armstrong number
    static boolean isArmstrongNumber(int num) {
        int temp = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        return sum == num;
    }


    public static void main(String[] args) {

        // Example usage of the functions
        int reversed = reverseNumber(12345);
        System.out.println("Reversed number: " + reversed);

        String input = "Hello World Java Programming";
        String reversedWords = reverseWords(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed Words: " + reversedWords);

        String reversedWordsInPosition = reverseWordsInPosition(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed Words in position: " + reversedWordsInPosition);

        System.out.print("Fibonacci series: ");
        printFibonacciSeries(10);
        System.out.println();

        int gcdResult = gcd(48, 18);
        System.out.println("GCD: " + gcdResult);

        boolean isPerfect = isPerfectNumber(28);
        System.out.println("Is perfect number: " + isPerfect);

        boolean areAnagrams = areAnagrams("listen", "silent");
        System.out.println("Are anagrams: " + areAnagrams);

        boolean isPalindrome = isPalindrome("radar");
        System.out.println("Is palindrome: " + isPalindrome);

        String str = "abcaabbc";
        Map<Character, Integer> freq = calculateCharacterFrequency(str);
        System.out.println("Character frequencies: " + freq);

        boolean isLeap = isLeapYear(2024);
        System.out.println("Is leap year: " + isLeap);

        List<Character> nonRepeating = findNonRepeatingCharacters("programming");
        System.out.println("Non-repeating characters: " + nonRepeating);

        String replaced = replaceSubstring("Hello, world!", "world", "Java");
        System.out.println("Replaced string: " + replaced);

        int[] arr = {3, 1, 4, 1, 5, 9};
        replaceByRank(arr);
        System.out.println("Array after replacing by rank: " + Arrays.toString(arr));

        List<Integer> nonRepeatingNumbers = findNonRepeatingElements(arr);
        System.out.println("Non-repeating elements: " + nonRepeatingNumbers);

        String longestPalin = findLongestPalindrome("babad");
        System.out.println("Longest palindrome: " + longestPalin);

        int fact = factorial(5);
        System.out.println("Factorial: " + fact);

        int recurFact = factorialRecursive(5);
        System.out.println("Recursive Factorial: " + recurFact);

        boolean isArmstrong = isArmstrongNumber(153);
        System.out.println("Is Armstrong number: " + isArmstrong);
    }
}
