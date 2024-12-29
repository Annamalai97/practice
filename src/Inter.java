public interface Inter {
    public void animal();

}

interface InnerInter extends Inter{

    public void bird();

    
}

 class Cat implements InnerInter{
    public void animal(){
        System.out.println("cat");
    }

    public void bird(){
        System.out.println("pigeon");
    }
    
}
class Dog implements Inter {

    public void animal(){
        System.out.println("dog");
    }
    public static void main(String[] args) {
        Inter i = new Cat();
        Inter i2 = new Dog();
        InnerInter i3 = new Cat();
        i.animal();
        i2.animal();
        i3.bird();
        
    }

    
}
