package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MultiDimensional {
    public static void main(String[] args) {
        List<List<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=1;i<5;i++){
            list.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);

        for(int i=0;i<mainList.size();i++){
            List<Integer> curr=mainList.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);

    }
}
