package Encapsulation;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;

    public void getFullName(){
        System.out.println(firstName +" "+ middleName +" "+ lastName);
        //return firstName +" "+ middleName +" "+ lastName;
    }

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

}
