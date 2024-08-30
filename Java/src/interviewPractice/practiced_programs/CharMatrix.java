package interviewPractice.practiced_programs;

//
class CharMatrix {

    public static void main(String[] args) {

        char[][] M = {{'s', 'o', 's', 'a'},
                {'s', 'o', 's', 'a'},
                {'s', 'o', 'o', 'a'}};
        int count = 0;
        String str = "";
        for (int i = 0; i < M.length; i++) {
            str = "";
//            for (int j = 0; j < M[i].length; j++) {}
            str = String.copyValueOf(M[i]);
            if (str.contains("os"))
                count++;
        }
        System.out.println(count);
    }
}
