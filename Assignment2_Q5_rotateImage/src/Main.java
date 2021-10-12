import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
    int[][] matrix3 = {{1}};
    int[][] matrix4 = {{1,2},{3,4}};

    matrix1 = rotateImage(matrix1);
    matrix2 = rotateImage(matrix2);
    matrix3 = rotateImage(matrix3);
    matrix4 = rotateImage(matrix4);

        for(int i = 0; i <matrix1.length; i ++){
            for(int j = 0; j < matrix1[0].length; j ++){
                System.out.print(matrix1[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i <matrix2.length; i ++){
            for(int j = 0; j < matrix2[0].length; j ++){
                System.out.print(matrix2[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i <matrix3.length; i ++){
            for(int j = 0; j < matrix3[0].length; j ++){
                System.out.print(matrix3[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i <matrix4.length; i ++){
            for(int j = 0; j < matrix4[0].length; j ++){
                System.out.print(matrix4[i][j]);
            }
            System.out.println();
        }

    }



    public static int[][] rotateImage(int[][] matrix){
        for(int i = 0; i < (matrix.length+1)/2; i ++){
            for(int j = 0; j < matrix.length/2; j ++) {
                int num;
                num = matrix[j][matrix.length-1-i];
                matrix[j][matrix.length-1-i] = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-1-j][i];
                matrix[matrix.length-1-j][i] = matrix[matrix.length-1-i][matrix.length-1-j];
                matrix[matrix.length-1-i][matrix.length-1-j] = num;
            }
        }
        return matrix;
    }
}
