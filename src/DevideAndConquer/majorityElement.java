package DevideAndConquer;

import java.util.HashMap;
import java.util.HashMap;
public class majorityElement {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }


        for (int i :freq.keySet()) {
            if (freq.get(i) > arr.length / 2) {
                System.out.println("Majority element: " + i);
            }
        }
    }


}
