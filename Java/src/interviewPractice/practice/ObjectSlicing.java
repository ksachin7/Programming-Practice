package interviewPractice.practice;

class ObjectSlicing {

    public static void main(String[] args) {
        A aa;

        // only a and will be assigned here so this is called object slicing
        aa = new B(2, 4, 6);

        System.out.println(aa.a);
        System.out.println(aa.b);
//        System.out.println(aa.c);
    }

}
