package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(30);
        list.add(-20);
        list.add(40);
//        Collections.sort(list,); ASC
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
