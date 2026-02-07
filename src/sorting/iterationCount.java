package sorting;
import java.util.*;
public class iterationCount {
    public static void main(String[] args) {
        int arr[]={2,8,5,4};
        int n=arr.length;
       int[][] pair=new int[n][2];

       for(int i=0;i<n;i++){
           pair[i][0]=arr[i]; //value
           pair[i][1]=i; // Original Index
       }
       Arrays.sort(pair,(a,b) -> Integer.compare(a[0],b[0]));

       boolean[] visited=new boolean[n];
       int swap=0;

       for(int i=0;i<n;i++){
           //if already visited Or element already in correct position
           if(visited[i] || pair[i][1]==i){
               continue;
           }
           int cycleSize=0;
           int j=i;

           while(!visited[j]){
               visited[j]=true;
               j=pair[j][1];
               cycleSize++;
           }
           swap+=(cycleSize-1);
       }
        System.out.println(swap);
    }
}
