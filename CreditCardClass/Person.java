package CreditCardClass;

public class Person {

    // instance variables
    private String lastName;
    private String firstName;
    private Address home;

    // Constructor for person with last name, first name and address
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // toString
    public String toString() {
        return (firstName + ", " + lastName + ", address is " + home);
    }
}
