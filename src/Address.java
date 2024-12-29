public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }

    public static void main(String[] args) {
        Address a = new Address("123 Main St", "Anytown", "Anystate", "12345");
        System.out.println(a.toString());
    }
}
