class DoctorInheritance {
    public DoctorInheritance() {
        System.out.println("DoctorInheritance constructor called");
    }

    public void speciality() {
        System.out.println("Cardiologists are doctors");
    }
    public static void speciality2(){
        System.out.println("physios are not doctors");
    }
}

class Cardio extends DoctorInheritance {
    public Cardio() { //child class
        super(); // Calls the constructor of the parent class (DoctorInheritance)
        System.out.println("Cardio constructor called");
    }

    public static void main(String[] args) {
        Cardio cardio = new Cardio();
        cardio.speciality();
    }
}
class Physio extends DoctorInheritance{
    public static void main(String[] args) {
        Physio p = new Physio();
        p.speciality2(); //object needed to call static methods
        System.out.println(super.speciality);
    }

    
}