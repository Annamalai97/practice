public class Demo {
    int i;

    // Constructor to initialize the field 'i'
    Demo(int i) {
        this.i = i;
    }

    // Method to check equality based on the field 'i'
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo d1 = (Demo) o;
        return this.i == d1.i;
    }

    public static void main(String[] args) {
        // Creating instances of the Demo class
        Demo d1 = new Demo(3);
        Demo d2 = new Demo(3);
        Demo d3 = new Demo(4);

        // Testing the equals method
        System.out.println(d1.equals(d2)); // true
        System.out.println(d1.equals(d3)); // false
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
    }
}
