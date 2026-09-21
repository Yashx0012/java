public class MatrixOperations{
    public static void main(String[] args){
        int row = 2, col = 2;

    int[][] martrixA = {
        {1,2},
        {3,4}
    };
    int[][] martrixB = {
        {5,6},
        {7,8}
    };  
    int[][] summatrix = new int[row][col];

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            summatrix[i][j] = martrixA[i][j] + martrixB[i][j];
        }

    }
    System.out.println("resultant after sum of the matrix  ");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
             System.out.print(summatrix[i][j] + " ");

        }
        System.out.println();

    }
    }
}