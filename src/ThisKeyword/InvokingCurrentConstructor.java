package ThisKeyword;

public class InvokingCurrentConstructor {
    public InvokingCurrentConstructor(){
        System.out.println("Invoked Constructor");
    }

    public InvokingCurrentConstructor(String s){
        this();     // Run this code commenting this(); to see the difference
        System.out.println(s);
    }

    public static void main(String[] args){
        InvokingCurrentConstructor is = new InvokingCurrentConstructor("Sumon");

    }
}
