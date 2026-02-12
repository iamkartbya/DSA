package Strings;
import java.util.*;
public class LongBalanceSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int ans=longestBalanceSubstring(str);
        System.out.println(ans);
    }
    public static int longestBalanceSubstring(String str){
       int n=str.length();
       int maxLen=0;

       for(int i=0;i<n;i++){
           int[] freq=new int[26];
           int distinct=0;
           int maxFreq=0;
           for(int j=i;j<n;j++){
               int index=str.charAt(j)-'a';

               if(freq[index]==0){
                   distinct++;
               }
               freq[index]++;
               maxFreq=Math.max(maxFreq,freq[index]);

               int length=j-i+1;
               if(maxFreq*distinct ==length){
                   maxLen=Math.max(maxLen,length);
               }
           }
       }
       return maxLen;
    }
}
