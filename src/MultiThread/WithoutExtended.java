package MultiThread;

public class WithoutExtended {

    public static void main(String[] args){

        Thread t1 = new Thread(){

            public void run(){
                for (int i=0;i<=20;i++){
                    System.out.println("Printing...... "+ i +"*"+"5"+"=" + i*5);
                    try {
                        sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        };
        t1.start();
    }


}
