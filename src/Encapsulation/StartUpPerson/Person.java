package Encapsulation.StartUpPerson;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public String getFullName(){
        return firstName + " " + middleName + " " + lastName;
    }

//    public void setFirstName(String newFirstName){
//        if (newFirstName.length()>= 2){
//            firstName = newFirstName;
//        }
//    }
//
//    public String getFirstName(){
//        return firstName;
//    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
