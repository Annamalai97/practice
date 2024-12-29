abstract class Abstract2 {
    abstract void fly();
    static String animal = "dog";

}

class Flight extends Abstract2{
    void fly(){
        animal= "cat";
        System.out.println("Flight is flying " + animal);
    }
}

class Heli extends Abstract2{
    void fly(){
        System.out.println("Heli is flying" + animal);
    }
    public static void main(String[] args) {
        Abstract2 f = new Flight();
        Abstract2 f2 = new Heli();
        f.fly();
        f2.fly();
    }
}
