package itssachin.assignments3;

class ThreadingClass implements Runnable {
    private Thread t;
    private String threadName;

    ThreadingClass( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        if( threadName == "Thread-1" ){
            this.printAlpha();
        }
        else if( threadName == "Thread-2" ){
            this.printOneToHundred();
        }
        else{
            this.printHundredMore();
        }
    }
    public void printAlpha(){
        for(int i=65; i<=90; i++)
        {
            char x = (char)i;
            System.out.println("RunnableDemo: " + threadName + ", " + x);
        }
    }
    public void printOneToHundred(){
        for(int i=1; i<=30; i++)
        {

            System.out.println("RunnableDemo: " + threadName + ", " + i);
        }
    }
    public void printHundredMore(){
        for(int i=30; i<=50; i++)
        {

            System.out.println("RunnableDemo: " + threadName + ", " + i);
        }
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this);
            t.start ();
            t.setName(threadName);
        }
    }
}
class MultiTasking {
    public static void main(String args[]) {
        ThreadingClass R1 = new ThreadingClass ( "Thread-1");
        ThreadingClass R2 = new ThreadingClass ( "Thread-2");
        ThreadingClass R3 = new ThreadingClass ( "Thread-3");
        R1.start();
        R2.start();
        R3.start();

    }
}