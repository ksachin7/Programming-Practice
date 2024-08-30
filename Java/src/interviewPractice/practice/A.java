package interviewPractice.practice;

// object slicing
class A {
    int a;
    int b;

    A() {
        a = b = 0;
    }

    A(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class B extends A {
    int c;

    B() {
        c = 0;
    }

    B(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
}
