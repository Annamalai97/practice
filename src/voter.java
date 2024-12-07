import java.util.Scanner;

public class voter {

    Scanner sc = new Scanner(System.in);
    
    public void checkEligibility() {
        int attempts = 0;
        System.out.println("enter your age");
        while (attempts < 1) {
            String name = sc.nextLine();
            try {
                int age = Integer.parseInt(name);
                if (age >= 18 && age < 130) {
                    System.out.println("you are eligible to vote");
                    attempts++;
                } else if (age <= 18 && age > 0) {
                    System.out.println("you are not eligible to vote");
                    attempts++;
                } else {
                    printInvalidAgeMessage();
                }
            } catch (NumberFormatException e) {
                printInvalidAgeMessage();
            }
        }
    }
    private void printInvalidAgeMessage() {
        System.out.println("please enter a valid age");
    }

    public static void main(String[] args) {
        voter voterInstance = new voter();
        voterInstance.checkEligibility();
    }

}
