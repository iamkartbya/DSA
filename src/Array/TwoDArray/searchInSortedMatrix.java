package Array.TwoDArray;

public class searchInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
        int key=20;
        searchInSortedArray(matrix,key);
    }
    public static boolean searchInSortedArray(int[][] metrix,int key){
        int row=metrix.length-1;
        int col=0;
        while(row>0 && col<metrix.length){
            if(metrix[row][col]==key){
                System.out.println("Key found at ("+row+" "+col+")");
                return true;
            }else if(key<metrix[row][col]){
                row--;
            }else {
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
}
