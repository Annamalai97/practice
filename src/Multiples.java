import java.util.Scanner;

public class Multiples {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        String mul= scan.nextLine();
        int multi = Integer.parseInt(mul);
        int a = 1;
        while (a<6) {
            System.out.println(multi*a);
            a++;
            
        }
        System.out.println("enter a number");
        int numb = scan.nextInt();
        for(int b=1;b<11;b++){
            System.out.println(numb*b);
            

        }
    }

}
