package itssachin.interviewPractice;
import java.util.*;
import java.util.Collections;

// COUPA Interview Questions
// Given an array, remove all duplicates except the first occurrence.
// Input:  [3,2,4,5,1,7,3,5,2,3,9]
// Output: [3,2,4,5,1,7,9]
class noDups{
    public static void main(String[] args){
        int [] arr= {3,2,4,5,1,7,3,5,2,3,9};
        HashSet<Integer> newhs= new HashSet<>();
        for (int e : arr) {
            newhs.add(e);
            System.out.println(newhs);
        }
        System.out.println(newhs);
    }
}

// Given a string, write a program to find the starting and ending index of subset of the string which is palindrome.
// COUPA Interview Questions
class SubStrPalindrome{
   public static boolean isPalindrome(String str){
        int i=0, j=str.length()-1;
        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void palIndex(String str){
        for (int i = 0 ; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                // i -> starting point of substring, j-> ending point of substring
                String sub= str.substring(i, j);
                if (isPalindrome(sub) && sub.length()>1) {
                    System.out.println("Start index of "+sub+": "+ str.indexOf(sub)+" and Ending index "+ (str.indexOf(sub)+sub.length()-1));
//                    System.out.println(str.substring(i, j));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a String with sub-string palindrome: ");
        String str= s.nextLine();
        palIndex(str);
    }
}

// Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function search(char pat[], char txt[]) that prints all occurrences of pat[] in
// txt[]. You may assume that n > m.
// COUPA Interview Questions

// Examples:
// Input:
// txt[] = "THIS IS A TEST TEXT"
// pat(] = "TEST"
// Output:
// Pattern found at index 10

// Input: txt[] = "AABAACAADAABAABA"
// pat[] = "AABA"
// Output:
// Pattern found at index 0
// Pattern found at index 9
// Pattern found at index 12
// "AAAA"

class AllOccurrence {
    public static void patIndex(String str, String pat){
        for (int i = 0 ; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                // i -> starting point of substring, j-> ending point of substring
                String sub= str.substring(i, j);
               if (str.substring(i, j).equals(pat))
                   System.out.println(str.indexOf(pat, i++));
            }
        }
    }
    public static void main(String[] args) {
        String pat= "AABA";
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a String with sub-string palindrome: ");
        String str= s.nextLine();
        patIndex(str, pat);
    }
}

/*
* Problem: You have a sorted int array write a function that returns a sorted array containing square of those numbers
* Solution: Since the square would be larger either of leftmost negative or the rightmost positive number hence we will check/compare
*           absolute value of both the leftmost and the rightmost element and put the square of the largest element in the array.
*/
public class practice {
     int[] sortedArray(int[] arr, int n){
         int[] sorted = new int[n];
         int left=0, right=0;
        for (int i = 0; i <= n-1; i++) {
            if ( Math.abs(arr[left]) > Math.abs(arr[n-1-right])) {
                sorted[i] = arr[left]*arr[left];
                left++;
            }
            else {
                sorted[i] = arr[n - 1 - right]*arr[n-1-right];
                right++;
            }

        }
        return sorted;
    }
    public static void main(String[] args) {
        practice pr= new practice();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = s.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i]= s.nextInt();
        }
        System.out.println(Arrays.toString(pr.sortedArray(arr, n)));
        System.out.println(Arrays.binarySearch(arr,5));
    }
}

// Convert An Array To ArrayList In Java With Example
class ArrayToArrayList{
    public static void main(String[] args) {
        String[] arr = {"abc", "xyz", "pqr"};

        // method-1
        ArrayList<String> al= new ArrayList<>(Arrays.asList(arr));
        System.out.println(al);

        // method-2
        ArrayList<String> alist= new ArrayList<>();
        for (String e: arr) {
            alist.add(e);
        }

        System.out.println(alist);

        // method-3
        ArrayList<String> list= new ArrayList<>();
        Collections.addAll(list, arr);
        System.out.println(list);
    }
}

// Convert An ArrayList To Array In Java With Example
class ArrayListToArray{
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
        al.add("xyz");
        al.add("abc");
        al.add("mno");
        al.add("pqr");
        al.add("oop");

        // method-1
        String[] str= new String[al.size()];
        for (int i = 0; i < al.size(); i++) {
            str[i]= al.get(i);
        }

        // printing array
        for (String string: str) {
            System.out.print(string+ " ");
        }

        // method-2
        String []str1= al.toArray(new String[al.size()]);
        System.out.println("\n"+Arrays.toString(str1));

        // method-3
        String[] str2= Arrays.copyOf(al.toArray(), al.size(), String[].class);
        System.out.println(Arrays.toString(str2));

        // method-4
        System.out.println(Arrays.toString(al.toArray()));
    }
}

// Sort List of Strings alphabetically
class SortingListUsingCollection{
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
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
        System.out.println("Sorted List: "+ts);
    }
}

// look for Sieve of Eratosthenes approach of finding prime on web
class AllPrimes{
    static void allPrimes(long n) {
        List<Integer> list = new ArrayList<>();

        boolean prime = false;

        if (n >= 2) {
            // looping through all the numbers till limit
            for (int i = 2; i <= n; i++) {
                if (i == 2 || i == 3)
                    prime = true;
                else {
                    // checking if current number is prime
                    for (int j = 2; j <= (int) (Math.sqrt(i)); j++) {
                        if(i%j == 0){
                            prime=false;
                            break;  // break is necessary. Once prime is false it won't check further
                        }
                        else prime=true;
                    }
                }
                if (prime) list.add(i);
            }
            System.out.println("Prime numbers between 1-" + n + ":\n" + list);
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the max-number till you want to check primes :");
        long n= s.nextInt();

        allPrimes(n);
    }
}

// find most repeated word


// print binary
class Binary{
    public void printBinary(int n){
        if(n<=0)
            System.out.println("Please enter a valid non-zero integer");
        for (int i = 0; i < n; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }

    public static void main(String[] args) {
        Binary b= new Binary();
        b.printBinary(10);

    }
}


// Second largest number in array
class SecondLargest{
    public static void main(String[] args) {
        Integer[] arr= {2, -1, 4, 5, 5, 6, 6};

        TreeSet<Integer> ts= new TreeSet<>(List.of(arr));
        System.out.println(ts.toArray()[ts.size()-2]);
    }
}


// segregate even-odd elements
class segregateEvenOdd{
    static void seg(int[] arr){
        int i=0, j=arr.length-1;

        while (i<j){

            while(arr[i]%2 == 0 && i<j)
                i++;
            while (arr[j]%2 != 0 && i<j)
                j--;

            // swapping elements
                int tmp;
                tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
//        int[] arr= {1,2,3,4,5,6,7};
        int arr[] = {12, 34, 45, 9, 8, 90, 3};

        seg(arr);
    }
}

// check palindrome for each element in the array and print it infront of that number
class PalSol{

    static void printMap(HashMap<Integer, Boolean> map){
        System.out.print("Palindrome: [ ");
        for (Map.Entry<Integer, Boolean> e: map.entrySet()) {
            System.out.print(e.getKey()+":"+ e.getValue()+" ");
        }
        System.out.print("]");
    }
    static void checkPalindrome(int[] arr){
        HashMap<Integer, Boolean> map= new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int tmp= arr[i], sum=0;
            boolean result= false;

            while(tmp>0){
                int r= tmp%10;
                sum = 10*sum+r;
                tmp/=10;
            }
            if(sum == arr[i])
                result= true;

            map.put(arr[i], result);
        }
        printMap(map);
    }

    public static void main(String[] args) {
        int[] arr= {201, 111, 101, 123};
        checkPalindrome(arr);
    }
}

// count spaces
class Spaces{
    static int countSpaces(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if(ch==32 || ch==' ')   // or condition is not necessary just to remember
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Spaces: "+countSpaces("    dsjbk    "));
    }
}

// even-odd
class EvenOdd {
    static int isEven(int n) {
        return (n & 1);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number :");
        n = sc.nextInt();
        if(isEven(n) == 0)
            System.out.print("Even\n");
        else
            System.out.print("Odd\n");
    }
}

//

class MainEO {
    static boolean isEven(int n) {
        boolean even_no = true;
        for (int i=1; i <= n; i++)
            even_no = !even_no;
        return even_no;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number :");
        n = sc.nextInt();
        if(isEven(n))
            System.out.print("Even\n");
        else
            System.out.print("Odd\n");
    }
}

// Compute total size of data and find min. required storage card which is in 2^n sizes that can store total data.
class MemoryCards{

    static int findStorageCard(int[] data){
        int cardSize= 0, dataSize=0;
        for (int e: data) {
            dataSize+=e;
        }
        System.out.println("Data size: "+dataSize);

        if(data.length == 0){
            return 0;
        }
        else {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                cardSize= (int)Math.pow(2, i);
                if (cardSize >= dataSize)
                    break;
            }
        }
        return cardSize;
    }
    public static void main(String[] args) {

        // given audio, video files of data in mb.
        int[] data= {23, 45, 56, 5, 40, 21, 33, 7};

        System.out.println("Minimum size card required is: "+findStorageCard(data));

    }
}


// Recursive java program to
// find sum of digits of a number

class sum_of_digits
{
    // Function to check sum
    // of digit using recursion
    static int sum_of_digit(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + sum_of_digit(n / 10));
    }

    static int digitsSum(int n){
        int sum=0;

        while(n !=0){
            sum += n%10;
            n= n/10;
        }
        return sum;
    }

    // Driven Program to check above
    public static void main(String args[])
    {
        int num = 12345;
        int result = sum_of_digit(num);
        System.out.println("Sum of digits in " +
                num + " is " + result);

        System.out.println(digitsSum(110));
    }
}

// java Program to find whether a Number
// is Prime or Not using Recursion
class GFG {

    // Returns true if n is prime, else
    // return false.
    // i is current divisor to check.
    static boolean isPrime(int n, int i) {

        // Base cases
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime(n, i + 1);
    }

    // Driver program to test above function
     static public void main(String[] args)
    {

        int n = 15;

        if (isPrime(n, 2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

//  The Time Complexity : O(sqrt(n)) and the Space Complexity : O(1)

// object slicing
class A{
    int a;
    int b;

    A(){
        a=b=0;
    }
    A(int a, int b){
        this.a= a;
        this.b= b;
    }
}

class B extends A{
    int c;
    B(){
        c=0;
    }
    B(int a, int b, int c){
        super(a,b);
        this.c=c;
    }
}

class ObjectSlicing{

    public static void main(String[] args) {
        A aa ;

        // only a and will be assigned here so this is called object slicing
        aa= new B(2, 4, 6);

        System.out.println(aa.a);
        System.out.println(aa.b);
//        System.out.println(aa.c);
    }

}

// range of perfect numbers
class RangePerfectNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); System.out.println("enter a number"); int n=sc.nextInt();
        for(int num=1; num<=n; num++)
        {
            int sum=1;
            for (int i=2;i<=num/2;i++ ) {
                if (num%i==0)
                    sum=sum+i; }
            if (sum==num) {
                System.out.println(num+" is a Perfect number"); }
        } }
}

// Random numbers
class RandomNumbers{
    public static void main(String[] args) {
        int max= 10, min= 1;
        int random= new Random().nextInt(max-min+1)+min;
        System.out.println(random);
    }
}

//
class CharMatrix{

    public static void main(String[] args) {

        char[][] M={{'s', 'o', 's', 'a'},
                    {'s', 'o', 's', 'a'},
                    {'s', 'o', 'o', 'a'}};
        int count=0;
        String str="";
        for (int i = 0; i < M.length; i++) {
            str="";
//            for (int j = 0; j < M[i].length; j++) {}
            str= String.copyValueOf(M[i]);
            if(str.contains("os"))
                count++;
        }
        System.out.println(count);
    }
}

// program to count number in array which has mean of both side element is equal to current element
class Mean{
    static int solution(int[] a) {

        int count= 0;
        for (int i = 0; i < a.length; i++) {
            if(i==0){
                if (a[i+1]/2==a[i])
                    count++;
            }
            else if(i== a.length-1){
                if ( a[i-1]/2==a[i])
                    count++;
            }
            else if((a[i-1]+a[i+1])/2 == a[i])
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr= {2, 4, 6, 6, 3};
        int[] arr1 = {2, 4, 6};
        System.out.println(solution(arr1));
    }
}

// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.


//
class Program{

    public static void main(String[] args) {
        int[] arr= {0, 0, 0, 0, 0};

    }
}