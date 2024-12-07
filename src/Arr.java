import java.util.ArrayList;
import java.util.List;

public class Arr {
    public static void main(String[] args) {
        int [] a = new int[5];
        int[] li2={1,2,3,4,5,};
        List<Integer> li = new ArrayList<>();
        a[0]= 4;
        a[1]=3;
        a[2]=2;
        a[3]=71;
        a[4]=81;
        for(int b=0;b<a.length;b++){
            System.out.println(a[b]);
        }
        System.out.println("________________");
        for(int d=0;d<li2.length;d++){
            System.out.println(li2[d]);
        }

    }

}
