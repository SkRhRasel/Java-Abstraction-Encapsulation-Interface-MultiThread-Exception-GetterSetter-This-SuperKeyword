package interfaceexample;

public class ClassTest implements Showable {
    @Override
    public void show() {
        System.out.println("This is show method");
    }

    @Override
    public void print() {

        System.out.println("This is Print method");
    }
}