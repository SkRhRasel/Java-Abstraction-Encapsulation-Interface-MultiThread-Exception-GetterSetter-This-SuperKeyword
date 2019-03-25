package MultiThread.ByImplementingRunnable;

import static java.lang.Thread.sleep;

public class ImplementRunnable implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<=10;i++){
            System.out.println("Loading......" + i*10+"%");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){

        ImplementRunnable m = new ImplementRunnable();
        Thread t1 = new Thread(m);
//        Thread t1= new Thread(new ImplementRunnable());
        t1.start();

    }

}
