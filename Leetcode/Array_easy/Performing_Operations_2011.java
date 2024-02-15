package Leetcode.Array_easy;

public class Performing_Operations_2011
{
    
    public static int finalValueAfterOperations(String[] operations)
    {
        int X =0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("++")) 
            {
                X++;
            }
            else if (operations[i].contains("--")) 
            {
                X--;
            }
        }

        return X;
    }

    public static void main(String[] args) {
       String [] operations = {"--X","X++","X++"};
      System.out.println( finalValueAfterOperations(operations));
    }

}
