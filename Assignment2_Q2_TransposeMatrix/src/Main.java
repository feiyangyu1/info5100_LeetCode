public class Main {

    public static void main(String[] args) {
	int[][] matrix1= {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
    int[][] matrix2 = {{1,2,3},
                       {4,5,6}};
   matrix1 = transposeMatrix(matrix1);
   matrix2 = transposeMatrix(matrix2);

   for(int i = 0; i < matrix1.length; i ++){
       for(int j = 0; j < matrix1[0].length; j++){
           System.out.print(matrix1[i][j]);
       }
       System.out.println();
   }

        for(int i = 0; i < matrix2.length; i ++){
            for(int j = 0; j < matrix2[0].length; j++){
                System.out.print(matrix2[i][j]);
            }
            System.out.println();
        }


    }

    public static int[][] transposeMatrix(int[][] matrix){

        if(matrix == null)
            return null;

        int row = matrix.length;
        int column = matrix[0].length;
        int[][] transposedMatrix = new int[column][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }
}
