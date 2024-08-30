package interviewPractice.practice;

import java.util.Scanner;

// range of perfect numbers
class RangePerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for (int num = 1; num <= n; num++) {
            int sum = 1;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0)
                    sum = sum + i;
            }
            if (sum == num) {
                System.out.println(num + " is a Perfect number");
            }
        }
    }
}
