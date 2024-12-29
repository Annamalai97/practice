public class OverrideLoad2 { //METHOD OVERLOADING

    // Method with one parameter
    public void display(int a) {
        System.out.println("Argument: " + a);
    }

    // Overloaded method with two parameters
    public void display(int a, int b) { 
        System.out.println("Arguments: " + a + ", " + b);
    }

    public static void main(String[] args) {
        OverrideLoad2 obj = new OverrideLoad2();
        obj.display(10); // Calls the first method
        obj.display(10, 20); // Calls the second method
    }
}