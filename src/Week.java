import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int a =0;
        while (a<1) {
            System.out.println("enter a number between 1 and 7");
            String name = sc.nextLine();
            int num = Integer.parseInt(name);
            if (num<1||num>7) {
                System.out.println("please enter a valid number");
                
                
            }
            else{
                try{
                    switch(num){
                        case 1:System.out.println("monday");
                        a++;
                        break;
                        case 2:System.out.println("tuesday");
                        a++;
                        break;
                        case 3:System.out.println("wednesday");
                        a++;
                        break;
                        case 4:System.out.println("thursday");
                        a++;
                        break;
                        case 5:System.out.println("friday");
                        a++;
                        break;
                        case 6:System.out.println("saturday");
                        a++;
                        break;
                        case 7:System.out.println("sunday");
                        a++;
                        break;
                        
        
                    }
                }
                catch(NumberFormatException e){
                    System.out.println("please enter a valid number");
                }
                
            }
            }
        
        
    }

}
