package Array;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        int n=50;
        boolean isTrue=true;
        for(int i=2;i<n+1;i++) {
            isTrue = true;
            for (int j = 2; j < Math.pow(i, 0.5) + 1; j++) {
                if (i % j == 0) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                System.out.println(i);
            }
        }
    }
}
