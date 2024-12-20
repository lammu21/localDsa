package Array_Medium;

public class Rotate_Image48 {
    public static void main(String[] args) {
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        // int n = matrix.length;
        // int m=matrix[0].length;
        // int [][] ans_matrix=new int[n][m];
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

    public static void rotate(int[][] matrix) {
        // int n = matrix.length;
        // int m=matrix[0].length;
        // int [][] ans_matrix=new int[n][m];
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         ans_matrix[i][j]=matrix[n-1-j][i];
        //     }
        // }

        // for (int i = 0; i < ans_matrix.length; i++) {
        //     for (int j = 0; j < ans_matrix[i].length; j++) {
        //         matrix[i][j]=ans_matrix[i][j];
        //     }
        // }

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         System.out.println(ans_matrix[i][j]);
        //     }
        // }

        for (int i = 0; i <= matrix.length-2; i++) {
            for (int j = i+1; j <=matrix[i].length-1; j++) {
                swap(matrix,i,j);
            }
        }
        reverse2DMatrixInPlace(matrix);
    }

    private static void swap(int[][] matrix, int i, int j) {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'swap'");
            int temp=matrix[j][i];
            matrix[j][i]=matrix[i][j];
            matrix[i][j]=temp;
        }

        public static void reverse2DMatrixInPlace(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
    
            // Reverse the rows
            // for (int i = 0; i < rows / 2; i++) {
            //     for (int j = 0; j < cols; j++) {
            //         // Swap elements in row order
            //         int temp = matrix[i][j];
            //         matrix[i][j] = matrix[rows - 1 - i][j];
            //         matrix[rows - 1 - i][j] = temp;
            //     }
            // }
    
            // Reverse the columns
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols / 2; j++) {
                    // Swap elements in column order
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][cols - 1 - j];
                    matrix[i][cols - 1 - j] = temp;
                }
            }
        }
}

    