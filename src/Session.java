import java.util.Scanner;

public class Session {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("enter a character");
         char ch= sc.next().charAt(0);
         char uc = Character.toLowerCase(ch);
         if (uc=='a'||uc=='e'||uc=='i'||uc=='o'||uc=='u') {
            System.out.println("it is a vovel");
            
         }
         else{
            System.out.println("it is a consonent");
         }


        }


        
    }
    

