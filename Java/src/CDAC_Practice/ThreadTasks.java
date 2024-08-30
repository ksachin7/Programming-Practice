package CDAC_Practice;

public class ThreadTasks extends Thread {
    public void run(){
        System.out.println("task one");
    }
    public static void main(String args[]){
        ThreadTasks t1=new ThreadTasks();
        ThreadTasks t2=new ThreadTasks();
        ThreadTasks t3=new ThreadTasks();

        t1.start();
        t2.start();
        t3.start();
    }
}

class TestMultitasking2 implements Runnable{
    public void run(){
        System.out.println("task one");
    }

    public static void main(String args[]){
        Thread t1 =new Thread(new TestMultitasking2());     //passing anonymous object of TestMultitasking2 class
        Thread t2 =new Thread(new TestMultitasking2());

        t1.start();
        t2.start();

    }
}