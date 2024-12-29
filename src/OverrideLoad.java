class Parent { //METHOD OVERRIDING 
    // Method in the parent class
    public void display() {
        System.out.println("Display method in Parent class");
    }
}

public class OverrideLoad extends Parent {

    // Overriding the method in the child class
    @Override
    public void display() {
        System.out.println("Display method in OverrideLoad class");
    }

    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.display(); // Calls the method in Parent class

        OverrideLoad obj2 = new OverrideLoad();
        obj2.display(); // Calls the overridden method in OverrideLoad class
    }
}
