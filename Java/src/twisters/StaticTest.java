package itssachin.twisters;

public class StaticTest extends parent {
    public static int x=10;
    static {
        System.out.println("inside static block");
    }

    StaticTest() {
        System.out.println("inside constructor of child");
    }

    {
        System.out.println("inside initialization block");
    }

    public static void main(String[] args) {
//        System.out.println(x);
//        System.out.println(y);
        System.out.println("inside main");
        new StaticTest();
        System.out.println("-------------------------");
        new StaticTest();
        System.out.println("main ends");
    }
}

class parent {
    public static int y=1;
    static {
        System.out.println("inside parent Static block");
    }

    {
        System.out.println("inside parent initialisation block");
    }

    parent() {
        System.out.println("inside parent constructor");
    }
}

class statcheck{
    static int i=10;

    static void show() {
        int i = 55;
        System.out.println("the value of i=" + i);
    }
    static{
        System.out.println(i);
        statcheck.show();
        System.out.println("1.Static Block");
        statcheck.show();
    }

    public static void main(String ar[]){
        statcheck ch=new statcheck();
    }
}