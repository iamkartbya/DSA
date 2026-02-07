package Strings;
public class BalanceString {
    public static void main(String[] args) {
       int ans=minimumDeletions("aababbab");
        System.out.println(ans);
    }
    public static int minimumDeletions(String s) {
        int b_count=0;
        int delcount=0;
        for(char c: s.toCharArray()){
            if(c=='b'){
                b_count++;
            }else{
                delcount=Math.min(delcount+1,b_count);
            }
        }
        return delcount;
    }
}
