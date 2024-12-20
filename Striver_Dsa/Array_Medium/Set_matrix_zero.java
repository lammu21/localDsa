package Array_Medium;

/**
 * Set_matrix_zero
 */
public class Set_matrix_zero {

    public static void main(String[] args) {
        // int [] [] matrix={{1,1,1},{1,0,1},{1,1,1}};
        int [][]matrix={{0,1}};
          setZeroes(matrix);
          for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
            
          }
    }

    public static void setZeroes(int[][] matrix) {
    //     // int n= matrix.length;
    //     // int m=matrix[]
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[i].length; j++) {
    //             if(matrix[i][j]==0){
    //                 setRowtoZeros(matrix,matrix.length,matrix[i].length,i);
    //                 setColumntoZeros(matrix,matrix.length,matrix[i].length,j);
    //             }
    //         }
    //     }
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[i].length; j++) {
    //             if (matrix[i][j]==Integer.MIN_VALUE) {
    //                 matrix[i][j]=0;
    //             }
    //         }
    //     }
    // }

    // private static void setColumntoZeros(int[][] matrix, int length, int length2, int j) {
    //     // // TODO Auto-generated method stub
    //     // throw new UnsupportedOperationException("Unimplemented method 'setColumntoZeros'");
    //     for (int i = 0; i <length; i++) {
    //         if(matrix[i][j]!=0&&matrix[i][j]!=Integer.MIN_VALUE){
    //             matrix[i][j]=Integer.MIN_VALUE;
    //         }
    //     }
    // }

    // private static void setRowtoZeros(int[][] matrix, int length, int length2, int i) {
    //     // TODO Auto-generated method stub
    //     // throw new UnsupportedOperationException("Unimplemented method 'setRowtoZeros'");
    //     for (int j = 0; j <length2; j++) {
    //         if (matrix[i][j]!=0&&matrix[i][j]!=Integer.MIN_VALUE) {
    //             matrix[i][j]=Integer.MIN_VALUE;
    //         }
    //     }
    // }
    int n= matrix.length;
    int m=matrix[0].length;
    int [] row = new int[n];
    int [] column= new int[m];
    for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(matrix[i][j]==0){
                       row[i]=1;
                       column[j]=1;
                    }
                }
            
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(row[i]==1||column[j]==1){
                        matrix[i][j]=0;
                    }
                }
            }

    }



    
}