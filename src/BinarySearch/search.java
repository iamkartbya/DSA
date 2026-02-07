package BinarySearch;
import java.util.*;
public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("Enter the target element");
//        int tar=sc.nextInt();
        boolean result = binarySearch(arr,97,n);
        System.out.println(result);

        boolean result1 = binarySearch(arr, 58,n);
        System.out.println(result1);

        boolean result2 = binarySearch(arr, 17,n);
        System.out.println(result2);
    }

    public static boolean binarySearch(int arr[], int tar, int n) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
          if(arr[mid]<tar){
              low=mid+1;
          }else if(arr[mid]>tar){
              high=mid-1;
          }else{
              return true;
          }
        }
        return false;
    }
}
