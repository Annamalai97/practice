import java.util.Scanner;

public class Swica {
    public static void main(String[] args) {
        int a= 2;
        switch(a){
            case 1:System.out.println("hi");
            case 2:System.out.println("hello");
            break;
            case 3:System.out.println("yes");
        }
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.printf("%d is even",num);
            
        }
        else{
            System.out.printf("%d is odd",num);
        }

    }

}
