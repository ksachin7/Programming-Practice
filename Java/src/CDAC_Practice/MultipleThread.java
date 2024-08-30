package CDAC_Practice;

public class MultipleThread extends Thread{
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

class MtMain {
    public static void main(String[] args)
    {
        int n = 7; // Number of threads
        for (int i = 0; i < n; i++) {
            MultipleThread object = new MultipleThread();
            object.start();
        }
    }
}

