package GetterSetter;

public class TimeTable {

    public static void main(String[] args){

        MyClock mc = new MyClock();
        mc.setTime("Current time is : 4:54 AM");

        String ct = mc.getTime();
        System.out.println(ct);
    }

}
