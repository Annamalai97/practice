import java.util.Scanner;

public class Dowhile {
public static void main(String[] args) {
    char chi;
    do{
        System.out.println("hi,welcome");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter y to continue");
        chi = scan.next().charAt(0);
    }
    while(chi=='y'||chi=='Y');
}

}
