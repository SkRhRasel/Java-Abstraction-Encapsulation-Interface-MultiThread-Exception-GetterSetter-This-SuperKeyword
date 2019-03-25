package MultiThread.ByImplementingRunnable;

public class UsingRunnable implements Runnable{

    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String args[]){
        UsingRunnable m = new UsingRunnable();
        Thread t = new Thread(m);
        t.start();
    }
}
