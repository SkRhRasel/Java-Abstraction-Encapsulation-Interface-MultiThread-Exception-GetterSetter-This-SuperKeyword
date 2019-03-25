package interfaceexample;

public class Startup implements Example1,Example2 {
    @Override
    public void test() {
        System.out.println("Interface 1");
    }

    @Override
    public void test1() {
        System.out.println("Interface 2");

    }
}
