package itssachin.interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class newJava {
    public static int counter(int[] a, int m) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            boolean containsDiff = map.containsKey(sum - (m * i));
            boolean containsSum = map.containsKey(sum);
            if (containsDiff) {
                int x = map.get(sum - (m * i));
                count += x;

            }
            if(containsSum){
                int x = map.get(sum);
                map.put(sum,x++);
            }else{
                map.put(sum,1);
            }
        }

        System.out.println(map);
        return count;
    }

    public static void main(String[] args) {
        int [] arr= {2, 4, 6, 6, 3};
        System.out.println(counter(arr, 3));
    }
}


// Java program to find number of
// palindromic permutations of a
// given string
class GFGg {

    static final int MAX = 256;

    // Returns factorial of n
    static long fact(int n)
    {
        long res = 1;

        for (int i = 2; i <= n; i++)
            res = res * i;

        return res;
    }

    // Returns count of palindromic
    // permutations of str.
    static int countPalinPermutations(String str)
    {

        // Count frequencies of all characters
        int n = str.length();
        int freq[]=new int[MAX];

        for (int i = 0; i < n; i++)
            freq[str.charAt(i)]++;

        // Since half of the characters
        // decide count of palindromic
        // permutations, we take (n/2)!
        long res = fact(n / 2);

        // To make sure that there is at
        // most one odd occurring char
        boolean oddFreq = false;

        // Traverse through all counts
        for (int i = 0; i < MAX; i++) {
            int half = freq[i] / 2;

            // To make sure that the
            // string can permute to
            // form a palindrome
            if (freq[i] % 2 != 0) {

                // If there are more than
                // one odd occurring chars
                if (oddFreq == true)
                    return 0;

                oddFreq = true;
            }

            // Divide all permutations with
            // repeated characters
            res = res / fact(half);
        }

        return (int)res;
    }

    // Driver code
    public static void main (String[] args)
    {

        String str = "aabb";

        System.out.print(countPalinPermutations(str));
    }
}



class testM{

    static int solve(int a[],int S){
        int n = a.length;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int runningSum = 0;
        int res=0;
        for(int i=0;i<n;i++){
            runningSum += a[i];
            final int key = runningSum - (S * (i + 1));
            res += map.getOrDefault(key,0);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return res;
    }
//
//    static int countMeans(int[] a){
//        int count = 0;
//        if (a[1]/2 == a[0])
//        count +=1;
//        for (int i = 1; i < a.length-1; i++) {
//            if (a[i-1] + a[i+1]/2 == a[i])
//            count += 1;
//            if (a[-2]/2 == a[-1])
//            count +=1;
//        }
//        return count;
//    }


    public static void main(String[] args) {
        int [] arr= {2, 4, 6, 6, 3};
        System.out.println(solve(arr, 4));
//        System.out.println(countMeans(arr));
    }
}
