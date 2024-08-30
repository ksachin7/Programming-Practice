package interviewPractice.practiced_programs;

// program to count number in array which has mean of both side element is equal to current element
class Mean {
    static int solution(int[] a) {

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                if (a[i + 1] / 2 == a[i])
                    count++;
            } else if (i == a.length - 1) {
                if (a[i - 1] / 2 == a[i])
                    count++;
            } else if ((a[i - 1] + a[i + 1]) / 2 == a[i])
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 6, 3};
        int[] arr1 = {2, 4, 6};
        System.out.println(solution(arr1));
    }
}
