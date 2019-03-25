package TestException;

public class ExceptionHandlingExample {

    public static void main(String args[]){
        try{
            int a =10;
            int b= 0;
            int c= a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Your Exception is: " + e);
        }

        System.out.println("My other code is running sucessfully");

    }
}
