package ThisKeyword;

public class UseofThis {
    int i1;
    int i2;

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    public static void main(String[] args){
        UseofThis uthis = new UseofThis();
        System.out.println(uthis.i1);
        System.out.println(uthis.i2);
    }
}
