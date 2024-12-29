import java.util.Scanner;

public class Cube {

    public static double cb(double lenght,double breath,double height){
        return lenght*breath*height;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter lenght");
        double lenght = scan.nextDouble();
        System.out.println("enter breath");
        double breath = scan.nextDouble();
        System.out.println("enter height");
        double height = scan.nextDouble();
        double vol=cb(lenght, breath, height);
        System.out.println("volume "+vol);
        
        

    }

}
