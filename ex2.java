import java.util.ArrayList;
import java.util.Collections;
public class ex2{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(8);
        list.add(2);
        list.add(15);

        int min = Collections.min(list);
        int max = Collections.max (list);
        double sum = 0;
        for (int i =0;1<list.size();i++){
            sum+=list.get(i);
        }
        double average=sum/list.size();
        System.out.println("min znach"+ min);
        System.out.println("max znach"+ max);
        System.out.println("average"+ average);
    }
}