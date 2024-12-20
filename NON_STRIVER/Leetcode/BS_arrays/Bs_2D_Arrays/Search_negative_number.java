package BS_arrays.Bs_2D_Arrays;

// leetcode-1351

public class Search_negative_number {
    
    public static void main(String[] args) {
        int [][] grid={{4,3,2,-1},
                      {3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
            System.out.println(countNegatives_Optimized_method(grid));
    }

    public static int countNegatives_brute_force_method(int[][] grid) {

        int count =0;

        for(int i=0;i<grid.length;i++)
        {
            for (int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]<0)
                {
                    count++;
                }
            }

        }
        return count;
        
    }

    public static int countNegatives_Optimized_method(int[][] grid) 
    {
        int row_pointer=grid.length-1;
        int column_pointer =0;
        int row = grid.length;
        // int column=grid[0].length;
        int counter=0;
        // int column_length=grid.length-1;
          while (row_pointer>=0&&column_pointer<grid[row_pointer].length) 
          {
             if (grid[row_pointer][column_pointer]<0) 
             {
                counter=counter+grid[row_pointer].length-column_pointer;
                row_pointer--;
                
             }
             else{
                column_pointer++;
             }
            
          }
        return  counter;
        
    }





}

