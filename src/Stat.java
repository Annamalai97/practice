import java.util.Scanner;

public class Stat {
    public static double Cl(double speed,double time){
        return speed*time;


    }
    public static void main(String[] argss){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter speed");
        double speed = scan.nextDouble();
        System.out.println("enter time");
        double time = scan.nextDouble();
        System.out.println(Cl(speed,time));

    }

}
