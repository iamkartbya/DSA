package Recursion;

public class PlaceTiles {
    public static void main(String[] args) {
        int ans=placeTiles(4);
        System.out.println(ans);
    }
    public static int placeTiles(int n){
        if(n==0 || n==1){
            return 1;
        }
        // Placing Vertically

        //Placing time horizontally
        return placeTiles(n-1) + placeTiles(n-2);
    }
}
