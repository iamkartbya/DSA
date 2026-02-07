package ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class SwapTwoNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        int idx=0,idx1=4;

        int temp=list.get(idx);
        list.set(idx,list.get(idx1));
        list.set(idx1,temp);

        System.out.println(list);
    }
}
