package Recursion;

public class FriendPairing {
    public static void main(String[] args) {
        System.out.println(friendPairing(4));
    }
    public static int friendPairing(int n){
        if(n==0 || n==1 || n==2){
            return n;
        }
        return friendPairing(n-1) +(n-1)*friendPairing(n-2);
    }

}
