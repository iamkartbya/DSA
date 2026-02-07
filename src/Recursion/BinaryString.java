package Recursion;

public class BinaryString {
    public static void main(String[] args) {
        binaryString(3,0,"");
    }
    public static void binaryString(int n,int lastPlace,String newString){
        if(n==0){
            System.out.println(newString);
            return;
        }
        binaryString(n-1,0,newString+"0");
        if(lastPlace==0){
            binaryString(n-1,1,newString+"1");
        }
    }
}
