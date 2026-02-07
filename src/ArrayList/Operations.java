package ArrayList;

import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //Add is list
        list.add(10); //O(1)
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        //Get array elemet
//        int getEle= list.get(2);
//        System.out.println(getEle);

        //Remove Element
//          list.remove(4);

        //Set Element
//        list.set(2,60);

        //Contains
       // System.out.println(list.contains(60));

        list.add(3,30);
        System.out.println(list);
    }
}
