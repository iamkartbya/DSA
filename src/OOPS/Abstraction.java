package OOPS;

public class Abstraction {
    public static void main(String[] args) {
//       Chieldren ch=new Chieldren();
        Queen q = new Queen();
        q.moves();
    }
}
interface   chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("Can move left rigth top up (in all 4 direction");
    }
}
class Rock implements chessPlayer{
    public void moves(){
        System.out.println("Can move left rigth  (in all 4 direction");
    }
}
class Pawn implements chessPlayer{
   public void moves(){
        System.out.println("Can move left  (in all 4 direction");
    }
}
class King implements chessPlayer{
   public void moves(){
        System.out.println("Can move left  (in all 4 direction");
    }
}
//abstract class Animal{
//    String color;
//     Animal(){
//         System.out.println("Animal constructor called");
//    }
//
//    void eat(){
//        System.out.println("Animal eats");
//    }
//    abstract void walk();
//}
//class Horse extends Animal{
//    Horse(){
//        System.out.println("Horse cunstructor called");
//    }
//
//    void changeColor(){
//        color="dark brown";
//    }
//
//    void walk(){
//        System.out.println("Horse walk by 4 leg");
//    }
//}
//class Chieldren extends Horse{
//    Chieldren(){
//        System.out.println("Chieldren cunstructor called");
//    }
//    void walk(){
//        System.out.println("It walks with two legs");
//    }
//}
