package Recursion;

import java.util.ArrayList;

public class FindIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr={3, 2, 4, 5, 6, 2, 7, 2, 2};
        System.out.println(findIndex(arr,8,0,list));

    }
    public static ArrayList<Integer> findIndex(int[] arr,int key,int idx ,ArrayList<Integer> list){
        if(idx==arr.length ){
            return list;
        }
        if(key==arr[idx]){
            list.add(idx);
        }
        findIndex(arr,key,idx+1,list);
        return list;
    }
}
