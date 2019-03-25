package Encapsulation;

public class StartUp {
    public static void main(String[] a){

        Person objPerson = new Person();

        objPerson.setFirstName("Md.");
        objPerson.setMiddleName("Abdul");
        objPerson.setLastName("Korim");
        //System.out.println(objPerson.getFullName());
        objPerson.getFullName();
    }
}
