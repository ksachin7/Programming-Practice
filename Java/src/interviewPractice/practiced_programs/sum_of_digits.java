package interviewPractice.practiced_programs;

class sum_of_digits {
    // Function to check sum
    // of digit using recursion
    static int sum_of_digit(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + sum_of_digit(n / 10));
    }

    static int digitsSum(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    // Driven Program to check above
    public static void main(String args[]) {
        int num = 12345;
        int result = sum_of_digit(num);
        System.out.println("Sum of digits in " +
                num + " is " + result);

        System.out.println(digitsSum(110));
    }
}
