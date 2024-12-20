package Leetcode.Array_easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rich_Customer_1617 {
    public static int maximumWealth(int[][] accounts) 
    {
        int count=0;
        int max=0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) 
            {
                count+=accounts[i][j];
            }
           if (count>max) {
            max=count;
           }
           count=0;
        }
        return max;
    }

    public static int[] decode1(int[] encoded, int first) {
        
        int [] result = new int[encoded.length];
        
        result[0]=first;

        for(int i=1;i<encoded.length;i++)
        {
           result[i=1]=encoded[i]^result[0];
        }
     
        return result;
        
    }










    public static void main(String[] args) {
        
    //     int [] [] accounts = {{1,2,3},{3,2,1}};
    //    System.out.println( maximumWealth(accounts));
       int [] encoded = {1,2,3};
       int [] decodedArray=decode1(encoded,1);
       System.out.println(Arrays.toString(decodedArray));
    }
}
