package SuperKeyword;

public class ZillaSchool extends CityCollege {

    // invoking super class constructor
    public ZillaSchool(){
        // we'll invoke Constructor of College
        super();
    }

    public static void main(String[] args){

        // creating object
        ZillaSchool as = new ZillaSchool();
        as.showing();
    }

    int students = 1200;

    public void showing(){
        System.out.println("Students: "+super.students);
        //System.out.println("Students: "+students);
    }


}
