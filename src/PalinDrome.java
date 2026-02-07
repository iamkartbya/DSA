public class PalinDrome {
    public static void main(String[] args) {
//        int num=123;
//        int rev=0;
//        int original=num;
//        while(num!=0){
//            int digit=num%10;
//            rev=rev*10+digit;
//            num/=10;
//        }
//        if(original==rev){
//            System.out.println("Pelindrome "+original);
//        }else{
//            System.out.println("Not palindrome "+original);
//        }
//         int n=5;
//         for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if((i+j)%2!=0){
//                    System.out.print("0 ");
//                }else{
//                    System.out.print("1 ");
//                }
//            }
//            for(int k=0;k<n-i;k++){
//                System.out.print(" ");
//            }
//             System.out.println();
//         }

//        int n=5;
//        for(int i=0;i<n;i++){
//           for(int j=0;j<i;j++){
//               System.out.print("*");
//           }
//           for(int k=0;k<2*(n-i);k++){
//               System.out.print(" ");
//           }
//
//           for(int t=0;t<i;t++){
//               System.out.print("*");
//           }
//            System.out.println();
//        }
//        for(int i=n;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            for(int k=0;k<2*(n-i);k++){
//                System.out.print(" ");
//            }
//
//            for(int t=0;t<i;t++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //HOLLOW ROUMBUS
//        int n=5;
//         for(int i=1;i<=n;i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= n; j++) {
//                 if (i == 1 || i == n || j == 1 || j == n) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

         //Diamond Pattern
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
           }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

         }
    }
