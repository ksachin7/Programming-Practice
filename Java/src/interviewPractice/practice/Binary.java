package interviewPractice.practice;

// print binary
class Binary {
    public void printBinary(int n) {
        if (n <= 0)
            System.out.println("Please enter a valid non-zero integer");
        for (int i = 0; i < n; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }

    public static void main(String[] args) {
        Binary b = new Binary();
        b.printBinary(10);

    }
}
