package interviewPractice.java;

// covariant return type
class SuperClass {
    SuperClass get() {
        System.out.println("SuperClass");
        return this;
    }
}

class SubClass extends SuperClass {
    SubClass get() {
        System.out.println("SubClass");
        return this;
    }

    public static void main(String[] args) {
        SuperClass tester = new SubClass();
        tester.get();
    }
}

