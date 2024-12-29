import java.util.Scanner;

class Student {
    private double id;
    private String name;
    private double age;
    public void studentDetails(double id,String name,double age){
        this.age=age;
        this.id=id;
        this.name=name;
    }
    public String getDetails(){
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
    

}

class InnerStudent {

    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter id");
        double id =scan.nextDouble();
        System.out.println("enter name");
        String name = scan.next();
        System.out.println("enter age");
        double age = scan.nextDouble();
        s1.studentDetails( id, name, age);
       System.out.println(s1.getDetails()); 
       scan.close();
    }
    

    
}
