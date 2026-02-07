package ArrayList;

import java.util.ArrayList;

public class MaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10); //O(1)
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println(max);
    }
}
