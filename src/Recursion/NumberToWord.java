package Recursion;

public class NumberToWord {
    public static void main(String[] args) {
        numberToWord(867);
    }
   public static void numberToWord(int n){
       if (n == 0) {
           return;
       }

       numberToWord(n / 10);

       int rem = n % 10;

       switch (rem) {
           case 0: System.out.print("zero "); break;
           case 1: System.out.print("one "); break;
           case 2: System.out.print("two "); break;
           case 3: System.out.print("three "); break;
           case 4: System.out.print("four "); break;
           case 5: System.out.print("five "); break;
           case 6: System.out.print("six "); break;
           case 7: System.out.print("seven "); break;
           case 8: System.out.print("eight "); break;
           case 9: System.out.print("nine "); break;
       }
   }
}
