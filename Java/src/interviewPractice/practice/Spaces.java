package interviewPractice.practice;

// count spaces
class Spaces {
    static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 32 || ch == ' ')   // or condition is not necessary just to remember
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Spaces: " + countSpaces("    dsjbk    "));
    }
}
