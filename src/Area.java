public class Area {
    int length;
    int breath;
    Area(int length,int breath){
        this.length=length;
        this.breath=breath;
    }

    public static void main(String[] args) {
        Area a = new Area(4, 05);
        System.out.println(a.length*a.breath);
    }
    
     

}
