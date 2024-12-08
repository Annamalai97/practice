import java.util.Scanner;

public class Parameter {
     int id=1;//instance variables
     int age=2;//these are non static variables
     String name="test";
    
    Parameter(int id,int age,String name){//these are local variables

        this.id = id; 
        this.age=age;
        this.name=name;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Parameter d = new Parameter(10,23,"ram");
        System.out.println("enter id");
        d.id= scan.nextInt();
        System.out.println("enter age");
        d.age=scan.nextInt();
        System.out.println("enter name");
        d.name= scan.next();
        System.out.printf("%d,%d,%s",d.id,d.age,d.name);
    }

}
