package interviewPractice.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// look for Sieve of Eratosthenes approach of finding prime on web
class AllPrimes {
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
                        if (i % j == 0) {
                            prime = false;
                            break;  // break is necessary. Once prime is false it won't check further
                        } else prime = true;
                    }
                }
                if (prime) list.add(i);
            }
            System.out.println("Prime numbers between 1-" + n + ":\n" + list);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the max-number till you want to check primes :");
        long n = s.nextInt();

        allPrimes(n);
    }
}
