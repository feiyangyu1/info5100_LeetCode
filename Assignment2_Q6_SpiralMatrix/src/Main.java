public class Main {

    public static void main(String[] args) {
	int[][] matrix1= {{1,2,3},{4,5,6},{7,8,9}};
    int[][] matrix2= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    int[] spiralMatrix1 = spiralMatrix(matrix1);
    int[] spiralMatrix2 = spiralMatrix(matrix2);
        for(int i : spiralMatrix1)
            System.out.print(i);

        System.out.println();

        for(int i : spiralMatrix2)
            System.out.print(i);

    }



    public static int[] spiralMatrix(int[][] matrix){
        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int leftColumn = 0;
        int rightColumn = matrix[0].length - 1;
        int[] spiralMatrix = new int[(matrix.length) * (matrix[0].length)];

        int i = 0;
        while (i < (matrix.length) * (matrix[0].length) && topRow <= bottomRow && leftColumn <= rightColumn){

            for(int j = leftColumn; j <= rightColumn; j++){
                spiralMatrix[i] = matrix[topRow][j];
                i ++;
            }
            topRow ++;

            for (int j = topRow; j <= bottomRow; j ++){
                spiralMatrix[i] = matrix[j][rightColumn];
                i ++;
            }
            rightColumn --;

            for(int j = rightColumn; j >= leftColumn && topRow <= bottomRow; j--){
                spiralMatrix[i] = matrix[bottomRow][j];
                i ++;
            }
            bottomRow --;

            for(int j = bottomRow; j >= topRow && leftColumn <= rightColumn; j--){
                spiralMatrix[i] = matrix[j][leftColumn];
                i ++;
            }
            leftColumn ++;
        }

        return spiralMatrix;
    }


}
