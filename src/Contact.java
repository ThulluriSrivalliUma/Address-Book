public class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String phoneNumber;
    String email;
    int pinCode;

    public Contact(String firstName, String lastName, String address, String city, String state, String phoneNumber, String email, int pinCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
