package Patterns;

public class PatternProblems {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern1(int n)
    {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=n; j++) {
                System.out.print("* ");
            }
            
            System.out.println(" ");
        }
       
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }


    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = n; col <= row; col--) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
                System.out.print("  ");
            }
            // when one row is printed, we need to add a newline
            System.out.println("  ");
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row <= 2*n; row++) {
            // for every row, run the col
             int number_of_columns=row > n ? 2 * n - row: row;
            for (int col = 0; col <= number_of_columns; col++) {
                System.out.print("* ");
                System.out.print("  ");
            }
            // when one row is printed, we need to add a newline
            System.out.println("  ");
        }
    }


}
