package Recursion;
 class Factorial {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,3,6};
       int key=7;
        int ans=fibnc(26);
        int occurence=firstOccurence(arr,key,arr.length-1);
        int powerCal=power(5,3);
        System.out.println(optimizedPower(5,5));
    }
   static int fibnc(int n){
       if(n==0 || n==1 ){
           return n;
       }
        int fib1=fibnc(n-1);
        int fib2=fibnc(n-2);
        int fib=fib1+fib2;
        return fib;
   }
   public static int firstOccurence(int[] arr,int key,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key,i-1);
   }
   public static int power(int x,int n) {
       if (x == 0) {
           return 0;
       }
       if (n == 0) {
           return 1;
       }
       return x * power(x, n - 1);
   }
   public static int optimizedPower(int x,int n) {
       if (n == 0) {
           return 1;
       }
       int halfSq= optimizedPower(x,n/2);
       int halfSquare=halfSq * halfSq;
       if(n%2!=0){
           halfSquare=x*halfSquare;
       }
       return halfSquare;
   }
}
