package Array.TwoDArray;

public class transpose {
    public static void main(String[] args) {
        int[][] matrix={{10,20,30},{40,50,60}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               // matrix[i][j]=matrix[j][i];
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
