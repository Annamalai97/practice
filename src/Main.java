abstract class Vehicle {
    abstract void move();
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("Bike is moving");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        
        myCar.move();  // Output: Car is moving
        myBike.move(); // Output: Bike is moving
    }
}