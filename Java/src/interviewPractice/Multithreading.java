package itssachin.interviewPractice;

public class Multithreading implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try{
                System.out.println("t1-> "+i);
                Thread.sleep(1000);

                // even if you throw an exception other threads will continue
//                if (i==4)
//                    throw new RuntimeException();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Multithreading mt= new Multithreading();
        Thread t1= new Thread(mt);
        t1.start();
        System.out.println("t1 alive? "+t1.isAlive());

        MyThread t2= new MyThread();
        t2.start();

        // Waits for this thread to die. Other Thread will continue after completing this one
        t2.join();

//        throw new RuntimeException();

    }
}

// You can use either way by implementing Runnable or extending Thread but...
// if you will extend thread you can't extend any other class
class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 10; i >0; i--) {
            try {
                System.out.println("t2-> "+i);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

/* ------------------------------------------------------------------------------ */

class Threads{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program started...");

        // Current thread..
        Thread t= Thread.currentThread();
        String tname= t.getName();
        System.out.println("Current running thread is: "+tname);

        // rename thread name
        t.setName("renamed-main");
        System.out.println(t.getName());

        // sleeping thread for 5ms
        Thread.sleep(1000);

        // getting thread id
        System.out.println(t.getId());

        System.out.println("Program stopped.");

        UserThread ut= new UserThread();
        ut.start();
    }
}

class UserThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("This is user thread.");
    }
}

/* ------------------------------------------------------------------------------ */

// Producer-Consumer Problem
class Company{
    int n;
    boolean turn=false;
    // turn= false -> producer-turn
    // turn= true -> consumer-turn

    // synchronizing these methods so that only one thread could run at a time
    // So Consumer and producer could run alternately
    synchronized public void produce_item(int n) throws InterruptedException {
        // if its not producer turn then wait
        if (turn)
            wait();
        this.n= n;
        System.out.println("Produced: "+this.n);
        turn= true;
        notify();
    }
    synchronized public int consume_item() throws InterruptedException {
        // if it
        if (!turn)
            wait();
        System.out.println("Consumed: "+this.n);
        turn= false;
        notify();
        return this.n;
    }
}

class Producer extends Thread{

    Company com;
    Producer(Company com){
        this.com= com;
    }
    int i=1;
    @Override
    public void run() {
        while (true){
            try {
                this.com.produce_item(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class Consumer extends Thread{

    Company com;
    Consumer(Company com){
        this.com= com;
    }
    @Override
    public void run() {
        while (true){
            try {
                this.com.consume_item();
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
        Company com= new Company();
        Producer p= new Producer(com);
        Consumer c= new Consumer(com);

        p.start();
        c.start();
    }
}