package Array;
import java.util.*;
public class palindrom {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int rev = 0;
//        int orginal = num;
//        while (num != 0) {
//            int digit = num % 10;
//            rev = rev * 10 + digit;
//            num/=10;
//        }
//        if (orginal == rev) {
//            System.out.println(orginal + " is a palindrome number");
//        }else {
//            System.out.println(orginal + " is not palindrome number");
//        }
//    }
//public static void main(String[] args) {
//    int[] arr={2,4,6,8,10};
//    int start=0;
//    int end=arr.length-1;
//    for(int i=0;i<arr.length;i++){
//        while(start<end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
//    System.out.println(Arrays.toString(arr));
//  }

    //Pairs in Array
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 8, 10};
//        int n=arr.length;
//        for (int start = 0; start < arr.length; start++) {
//            int curr = arr[start];
//            for (int sec = start + 1; sec < arr.length; sec++) {
//                System.out.print("(" + curr + "," + arr[sec] + ") ");
//            }
//            System.out.println();
//        }
//        int totpair=n*(n-1)/2;
//        System.out.println("total pain="+totpair);
//    }
//    SubArray
//    public static void main(String[] args) {
//        int[] arr={3,2,1,4};
//
//        int n=arr.length;
//        int maxSum=Integer.MIN_VALUE;
//
//        int prefix[] =new int[arr.length];
//        prefix[0]=arr[0];
//        for(int i=1;i<prefix.length;i++) {
//        prefix[i]=arr[i]+prefix[i-1];
//        }
//        for(int i=0;i<arr.length;i++){
//            for(int j=i;j<arr.length;j++) {
//                int currSum = 0;
//            for (int k = i; k <= j; k++) {
//                   System.out.print(arr[k] + " ");
//                    currSum += arr[k];
//                }
//                System.out.println();
//                // currSum= i==0? prefix[j]:prefix[j]-prefix[i-1];
////                if(maxSum<currSum){
////                    maxSum=currSum;
////                }
//            }
//        }
//       // System.out.println("Max Sub Array"+maxSum);
//    }

//   Max Subarray Sum - KADANE'S Algorithm
   public static void main(String[] args) {
      int[] arr={-2,5,-6,1};
       int ms=arr[0];
       int cs=arr[0];
       for (int i = 1; i < arr.length; i++) {
           cs = Math.max(arr[i], cs + arr[i]);
           ms = Math.max(ms, cs);
       }
       System.out.println("max subarray sum is: "+ms);
     }
}

