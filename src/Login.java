import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException() {
        System.out.println("new password");
    }
}

public class Login {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your username");
        String username = scan.next();
        System.out.println("enter password");
        String password= scan.next();
        if(username.equals("admin") && password.equals("pass")){
            System.out.println("login sucessfull");

        }

        else{
            try {
                InvalidPasswordException e = new InvalidPasswordException();
                throw e;
            } catch (Exception a) {
                System.out.println("wrong password");
            } 
        }
    }

}
