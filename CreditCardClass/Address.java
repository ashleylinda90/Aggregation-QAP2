package CreditCardClass;

public class Address {

    // instance variables
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor for address with multiple parameters
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // toString
    public String toString() {
        return (street + ", " + city + ", " + state + " " + zip);
    }
}
