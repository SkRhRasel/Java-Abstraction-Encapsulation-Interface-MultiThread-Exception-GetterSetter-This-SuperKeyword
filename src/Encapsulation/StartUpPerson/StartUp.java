package Encapsulation.StartUpPerson;

public class StartUp {
    public static void main(String[] args){

        Person person1 = new Person();

//        person1.setFirstName("Abdul");
//        String name = person1.getFirstName();

        //person1.firstName = "A";

//        person1.middleName = "Matin";
//        person1.lastName = "Mia";
//        person1.age = 25;

        person1.setFirstName("Abdul");
        person1.setMiddleName("Matin");
        person1.setLastName("Mia");
        System.out.println(person1.getFullName());


        Person person2 = new Person();

        person2.setFirstName("SK");
        person2.setMiddleName("Mojid");
        person2.setLastName("Bari");

        person2 = person1;

        person1 = null;

        System.out.println(person2.getFullName());
        //System.out.println(person1.getFullName());


        Person person3 = new Person();

        person3.setFirstName("Md");
        person3.setMiddleName("Korim");
        person3.setLastName("Hai");
        System.out.println(person3.getFullName());

    }
}
