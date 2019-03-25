package MultiThread.ByExtendingThread;

public class JustThread extends Thread{

    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String args[]){
        JustThread t = new JustThread();
        t.start();
    }

}
