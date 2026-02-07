package vector;
import java.util.*;
public class operation {
    public static void main(String[] args) {
//        int count=0;
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(10);
//        list.add(21);
//        list.add(32);
//        list.add(47);
//        list.add(56);
//        int n=list.size();
//        for(int i=0;i<n;i++) {
//           if(list.get(i)%2==0){
//               count++;
//           }
//        }
//  System.out.println(count);
      int[] arr={1, 7,7 , 5, 5, 5, 4};
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxFreq=0;
      for(int x :arr){
          map.put(x,map.getOrDefault(x,0)+1);
          maxFreq=Math.max(maxFreq,map.get(x));
      }
     int max1=0,max2=0;
      for(int freq:map.values()){
          if(freq>max1){
              max2=max1;
              max1=freq;
          }else if(freq>max2 && freq !=max1){
              max2=freq;

          }
      }
      if(max2==0){
          System.out.println(-1);
          return;
      }
      for(int key:map.keySet()){
          if(map.get(key)==max2){
              System.out.println(key);
              break;
          }
      }
    }
}
