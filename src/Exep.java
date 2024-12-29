public class Exep {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage()); // Print the exception message
            e.printStackTrace(); // Print the stack trace of the exception
        }
        finally{
            System.out.println("default message");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
